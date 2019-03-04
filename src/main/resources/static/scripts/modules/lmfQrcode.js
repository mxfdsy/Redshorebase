(function (factory) {
    "use strict";
    //使用方法 $(selector).qrcode({width: 150, height: 150, render: 'image', text: "text"})
    layui.define(function (exports) {
        exports('lmfQrcode', factory(layui.$));
    })
})(function ($) {
    (function (t) {
        function e(t) {
            this.mode = n.MODE_8BIT_BYTE;
            this.data = t
        }

        e.prototype = {
            getLength: function (t) {
                return this.data.length
            }, write: function (t) {
                for (var e = 0; e < this.data.length; e++) {
                    t.put(this.data.charCodeAt(e), 8)
                }
            }
        };

        function r(t, e) {
            this.typeNumber = t;
            this.errorCorrectLevel = e;
            this.modules = null;
            this.moduleCount = 0;
            this.dataCache = null;
            this.dataList = new Array
        }

        r.prototype = {
            addData: function (t) {
                var r = new e(t);
                this.dataList.push(r);
                this.dataCache = null
            }, isDark: function (t, e) {
                if (t < 0 || this.moduleCount <= t || e < 0 || this.moduleCount <= e) {
                    throw new Error(t + "," + e)
                }
                return this.modules[t][e]
            }, getModuleCount: function () {
                return this.moduleCount
            }, make: function () {
                if (this.typeNumber < 1) {
                    var t = 1;
                    for (t = 1; t < 40; t++) {
                        var e = l.getRSBlocks(t, this.errorCorrectLevel);
                        var r = new f;
                        var n = 0;
                        for (var o = 0; o < e.length; o++) {
                            n += e[o].dataCount
                        }
                        for (var o = 0; o < this.dataList.length; o++) {
                            var a = this.dataList[o];
                            r.put(a.mode, 4);
                            r.put(a.getLength(), i.getLengthInBits(a.mode, t));
                            a.write(r)
                        }
                        if (r.getLengthInBits() <= n * 8) break
                    }
                    this.typeNumber = t
                }
                this.makeImpl(false, this.getBestMaskPattern())
            }, makeImpl: function (t, e) {
                this.moduleCount = this.typeNumber * 4 + 17;
                this.modules = new Array(this.moduleCount);
                for (var n = 0; n < this.moduleCount; n++) {
                    this.modules[n] = new Array(this.moduleCount);
                    for (var o = 0; o < this.moduleCount; o++) {
                        this.modules[n][o] = null
                    }
                }
                this.setupPositionProbePattern(0, 0);
                this.setupPositionProbePattern(this.moduleCount - 7, 0);
                this.setupPositionProbePattern(0, this.moduleCount - 7);
                this.setupPositionAdjustPattern();
                this.setupTimingPattern();
                this.setupTypeInfo(t, e);
                if (this.typeNumber >= 7) {
                    this.setupTypeNumber(t)
                }
                if (this.dataCache == null) {
                    this.dataCache = r.createData(this.typeNumber, this.errorCorrectLevel, this.dataList)
                }
                this.mapData(this.dataCache, e)
            }, setupPositionProbePattern: function (t, e) {
                for (var r = -1; r <= 7; r++) {
                    if (t + r <= -1 || this.moduleCount <= t + r) continue;
                    for (var n = -1; n <= 7; n++) {
                        if (e + n <= -1 || this.moduleCount <= e + n) continue;
                        if (0 <= r && r <= 6 && (n == 0 || n == 6) || 0 <= n && n <= 6 && (r == 0 || r == 6) || 2 <= r && r <= 4 && 2 <= n && n <= 4) {
                            this.modules[t + r][e + n] = true
                        } else {
                            this.modules[t + r][e + n] = false
                        }
                    }
                }
            }, getBestMaskPattern: function () {
                var t = 0;
                var e = 0;
                for (var r = 0; r < 8; r++) {
                    this.makeImpl(true, r);
                    var n = i.getLostPoint(this);
                    if (r == 0 || t > n) {
                        t = n;
                        e = r
                    }
                }
                return e
            }, createMovieClip: function (t, e, r) {
                var n = t.createEmptyMovieClip(e, r);
                var o = 1;
                this.make();
                for (var a = 0; a < this.modules.length; a++) {
                    var i = a * o;
                    for (var u = 0; u < this.modules[a].length; u++) {
                        var s = u * o;
                        var h = this.modules[a][u];
                        if (h) {
                            n.beginFill(0, 100);
                            n.moveTo(s, i);
                            n.lineTo(s + o, i);
                            n.lineTo(s + o, i + o);
                            n.lineTo(s, i + o);
                            n.endFill()
                        }
                    }
                }
                return n
            }, setupTimingPattern: function () {
                for (var t = 8; t < this.moduleCount - 8; t++) {
                    if (this.modules[t][6] != null) {
                        continue
                    }
                    this.modules[t][6] = t % 2 == 0
                }
                for (var e = 8; e < this.moduleCount - 8; e++) {
                    if (this.modules[6][e] != null) {
                        continue
                    }
                    this.modules[6][e] = e % 2 == 0
                }
            }, setupPositionAdjustPattern: function () {
                var t = i.getPatternPosition(this.typeNumber);
                for (var e = 0; e < t.length; e++) {
                    for (var r = 0; r < t.length; r++) {
                        var n = t[e];
                        var o = t[r];
                        if (this.modules[n][o] != null) {
                            continue
                        }
                        for (var a = -2; a <= 2; a++) {
                            for (var u = -2; u <= 2; u++) {
                                if (a == -2 || a == 2 || u == -2 || u == 2 || a == 0 && u == 0) {
                                    this.modules[n + a][o + u] = true
                                } else {
                                    this.modules[n + a][o + u] = false
                                }
                            }
                        }
                    }
                }
            }, setupTypeNumber: function (t) {
                var e = i.getBCHTypeNumber(this.typeNumber);
                for (var r = 0; r < 18; r++) {
                    var n = !t && (e >> r & 1) == 1;
                    this.modules[Math.floor(r / 3)][r % 3 + this.moduleCount - 8 - 3] = n
                }
                for (var r = 0; r < 18; r++) {
                    var n = !t && (e >> r & 1) == 1;
                    this.modules[r % 3 + this.moduleCount - 8 - 3][Math.floor(r / 3)] = n
                }
            }, setupTypeInfo: function (t, e) {
                var r = this.errorCorrectLevel << 3 | e;
                var n = i.getBCHTypeInfo(r);
                for (var o = 0; o < 15; o++) {
                    var a = !t && (n >> o & 1) == 1;
                    if (o < 6) {
                        this.modules[o][8] = a
                    } else if (o < 8) {
                        this.modules[o + 1][8] = a
                    } else {
                        this.modules[this.moduleCount - 15 + o][8] = a
                    }
                }
                for (var o = 0; o < 15; o++) {
                    var a = !t && (n >> o & 1) == 1;
                    if (o < 8) {
                        this.modules[8][this.moduleCount - o - 1] = a
                    } else if (o < 9) {
                        this.modules[8][15 - o - 1 + 1] = a
                    } else {
                        this.modules[8][15 - o - 1] = a
                    }
                }
                this.modules[this.moduleCount - 8][8] = !t
            }, mapData: function (t, e) {
                var r = -1;
                var n = this.moduleCount - 1;
                var o = 7;
                var a = 0;
                for (var u = this.moduleCount - 1; u > 0; u -= 2) {
                    if (u == 6) u--;
                    while (true) {
                        for (var s = 0; s < 2; s++) {
                            if (this.modules[n][u - s] == null) {
                                var h = false;
                                if (a < t.length) {
                                    h = (t[a] >>> o & 1) == 1
                                }
                                var l = i.getMask(e, n, u - s);
                                if (l) {
                                    h = !h
                                }
                                this.modules[n][u - s] = h;
                                o--;
                                if (o == -1) {
                                    a++;
                                    o = 7
                                }
                            }
                        }
                        n += r;
                        if (n < 0 || this.moduleCount <= n) {
                            n -= r;
                            r = -r;
                            break
                        }
                    }
                }
            }
        };
        r.PAD0 = 236;
        r.PAD1 = 17;
        r.createData = function (t, e, n) {
            var o = l.getRSBlocks(t, e);
            var a = new f;
            for (var u = 0; u < n.length; u++) {
                var s = n[u];
                a.put(s.mode, 4);
                a.put(s.getLength(), i.getLengthInBits(s.mode, t));
                s.write(a)
            }
            var h = 0;
            for (var u = 0; u < o.length; u++) {
                h += o[u].dataCount
            }
            if (a.getLengthInBits() > h * 8) {
                throw new Error("code length overflow. (" + a.getLengthInBits() + ">" + h * 8 + ")")
            }
            if (a.getLengthInBits() + 4 <= h * 8) {
                a.put(0, 4)
            }
            while (a.getLengthInBits() % 8 != 0) {
                a.putBit(false)
            }
            while (true) {
                if (a.getLengthInBits() >= h * 8) {
                    break
                }
                a.put(r.PAD0, 8);
                if (a.getLengthInBits() >= h * 8) {
                    break
                }
                a.put(r.PAD1, 8)
            }
            return r.createBytes(a, o)
        };
        r.createBytes = function (t, e) {
            var r = 0;
            var n = 0;
            var o = 0;
            var a = new Array(e.length);
            var u = new Array(e.length);
            for (var s = 0; s < e.length; s++) {
                var l = e[s].dataCount;
                var f = e[s].totalCount - l;
                n = Math.max(n, l);
                o = Math.max(o, f);
                a[s] = new Array(l);
                for (var g = 0; g < a[s].length; g++) {
                    a[s][g] = 255 & t.buffer[g + r]
                }
                r += l;
                var v = i.getErrorCorrectPolynomial(f);
                var d = new h(a[s], v.getLength() - 1);
                var c = d.mod(v);
                u[s] = new Array(v.getLength() - 1);
                for (var g = 0; g < u[s].length; g++) {
                    var m = g + c.getLength() - u[s].length;
                    u[s][g] = m >= 0 ? c.get(m) : 0
                }
            }
            var E = 0;
            for (var g = 0; g < e.length; g++) {
                E += e[g].totalCount
            }
            var p = new Array(E);
            var T = 0;
            for (var g = 0; g < n; g++) {
                for (var s = 0; s < e.length; s++) {
                    if (g < a[s].length) {
                        p[T++] = a[s][g]
                    }
                }
            }
            for (var g = 0; g < o; g++) {
                for (var s = 0; s < e.length; s++) {
                    if (g < u[s].length) {
                        p[T++] = u[s][g]
                    }
                }
            }
            return p
        };
        t.QRCode = r;
        var n = t.QRMode = {MODE_NUMBER: 1 << 0, MODE_ALPHA_NUM: 1 << 1, MODE_8BIT_BYTE: 1 << 2, MODE_KANJI: 1 << 3};
        var o = t.QRErrorCorrectLevel = {L: 1, M: 0, Q: 3, H: 2};
        var a = t.QRMaskPattern = {
            PATTERN000: 0,
            PATTERN001: 1,
            PATTERN010: 2,
            PATTERN011: 3,
            PATTERN100: 4,
            PATTERN101: 5,
            PATTERN110: 6,
            PATTERN111: 7
        };
        var i = {
            PATTERN_POSITION_TABLE: [[], [6, 18], [6, 22], [6, 26], [6, 30], [6, 34], [6, 22, 38], [6, 24, 42], [6, 26, 46], [6, 28, 50], [6, 30, 54], [6, 32, 58], [6, 34, 62], [6, 26, 46, 66], [6, 26, 48, 70], [6, 26, 50, 74], [6, 30, 54, 78], [6, 30, 56, 82], [6, 30, 58, 86], [6, 34, 62, 90], [6, 28, 50, 72, 94], [6, 26, 50, 74, 98], [6, 30, 54, 78, 102], [6, 28, 54, 80, 106], [6, 32, 58, 84, 110], [6, 30, 58, 86, 114], [6, 34, 62, 90, 118], [6, 26, 50, 74, 98, 122], [6, 30, 54, 78, 102, 126], [6, 26, 52, 78, 104, 130], [6, 30, 56, 82, 108, 134], [6, 34, 60, 86, 112, 138], [6, 30, 58, 86, 114, 142], [6, 34, 62, 90, 118, 146], [6, 30, 54, 78, 102, 126, 150], [6, 24, 50, 76, 102, 128, 154], [6, 28, 54, 80, 106, 132, 158], [6, 32, 58, 84, 110, 136, 162], [6, 26, 54, 82, 110, 138, 166], [6, 30, 58, 86, 114, 142, 170]],
            G15: 1 << 10 | 1 << 8 | 1 << 5 | 1 << 4 | 1 << 2 | 1 << 1 | 1 << 0,
            G18: 1 << 12 | 1 << 11 | 1 << 10 | 1 << 9 | 1 << 8 | 1 << 5 | 1 << 2 | 1 << 0,
            G15_MASK: 1 << 14 | 1 << 12 | 1 << 10 | 1 << 4 | 1 << 1,
            getBCHTypeInfo: function (t) {
                var e = t << 10;
                while (i.getBCHDigit(e) - i.getBCHDigit(i.G15) >= 0) {
                    e ^= i.G15 << i.getBCHDigit(e) - i.getBCHDigit(i.G15)
                }
                return (t << 10 | e) ^ i.G15_MASK
            },
            getBCHTypeNumber: function (t) {
                var e = t << 12;
                while (i.getBCHDigit(e) - i.getBCHDigit(i.G18) >= 0) {
                    e ^= i.G18 << i.getBCHDigit(e) - i.getBCHDigit(i.G18)
                }
                return t << 12 | e
            },
            getBCHDigit: function (t) {
                var e = 0;
                while (t != 0) {
                    e++;
                    t >>>= 1
                }
                return e
            },
            getPatternPosition: function (t) {
                return i.PATTERN_POSITION_TABLE[t - 1]
            },
            getMask: function (t, e, r) {
                switch (t) {
                    case a.PATTERN000:
                        return (e + r) % 2 == 0;
                    case a.PATTERN001:
                        return e % 2 == 0;
                    case a.PATTERN010:
                        return r % 3 == 0;
                    case a.PATTERN011:
                        return (e + r) % 3 == 0;
                    case a.PATTERN100:
                        return (Math.floor(e / 2) + Math.floor(r / 3)) % 2 == 0;
                    case a.PATTERN101:
                        return e * r % 2 + e * r % 3 == 0;
                    case a.PATTERN110:
                        return (e * r % 2 + e * r % 3) % 2 == 0;
                    case a.PATTERN111:
                        return (e * r % 3 + (e + r) % 2) % 2 == 0;
                    default:
                        throw new Error("bad maskPattern:" + t)
                }
            },
            getErrorCorrectPolynomial: function (t) {
                var e = new h([1], 0);
                for (var r = 0; r < t; r++) {
                    e = e.multiply(new h([1, u.gexp(r)], 0))
                }
                return e
            },
            getLengthInBits: function (t, e) {
                if (1 <= e && e < 10) {
                    switch (t) {
                        case n.MODE_NUMBER:
                            return 10;
                        case n.MODE_ALPHA_NUM:
                            return 9;
                        case n.MODE_8BIT_BYTE:
                            return 8;
                        case n.MODE_KANJI:
                            return 8;
                        default:
                            throw new Error("mode:" + t)
                    }
                } else if (e < 27) {
                    switch (t) {
                        case n.MODE_NUMBER:
                            return 12;
                        case n.MODE_ALPHA_NUM:
                            return 11;
                        case n.MODE_8BIT_BYTE:
                            return 16;
                        case n.MODE_KANJI:
                            return 10;
                        default:
                            throw new Error("mode:" + t)
                    }
                } else if (e < 41) {
                    switch (t) {
                        case n.MODE_NUMBER:
                            return 14;
                        case n.MODE_ALPHA_NUM:
                            return 13;
                        case n.MODE_8BIT_BYTE:
                            return 16;
                        case n.MODE_KANJI:
                            return 12;
                        default:
                            throw new Error("mode:" + t)
                    }
                } else {
                    throw new Error("type:" + e)
                }
            },
            getLostPoint: function (t) {
                var e = t.getModuleCount();
                var r = 0;
                for (var n = 0; n < e; n++) {
                    for (var o = 0; o < e; o++) {
                        var a = 0;
                        var i = t.isDark(n, o);
                        for (var u = -1; u <= 1; u++) {
                            if (n + u < 0 || e <= n + u) {
                                continue
                            }
                            for (var s = -1; s <= 1; s++) {
                                if (o + s < 0 || e <= o + s) {
                                    continue
                                }
                                if (u == 0 && s == 0) {
                                    continue
                                }
                                if (i == t.isDark(n + u, o + s)) {
                                    a++
                                }
                            }
                        }
                        if (a > 5) {
                            r += 3 + a - 5
                        }
                    }
                }
                for (var n = 0; n < e - 1; n++) {
                    for (var o = 0; o < e - 1; o++) {
                        var h = 0;
                        if (t.isDark(n, o)) h++;
                        if (t.isDark(n + 1, o)) h++;
                        if (t.isDark(n, o + 1)) h++;
                        if (t.isDark(n + 1, o + 1)) h++;
                        if (h == 0 || h == 4) {
                            r += 3
                        }
                    }
                }
                for (var n = 0; n < e; n++) {
                    for (var o = 0; o < e - 6; o++) {
                        if (t.isDark(n, o) && !t.isDark(n, o + 1) && t.isDark(n, o + 2) && t.isDark(n, o + 3) && t.isDark(n, o + 4) && !t.isDark(n, o + 5) && t.isDark(n, o + 6)) {
                            r += 40
                        }
                    }
                }
                for (var o = 0; o < e; o++) {
                    for (var n = 0; n < e - 6; n++) {
                        if (t.isDark(n, o) && !t.isDark(n + 1, o) && t.isDark(n + 2, o) && t.isDark(n + 3, o) && t.isDark(n + 4, o) && !t.isDark(n + 5, o) && t.isDark(n + 6, o)) {
                            r += 40
                        }
                    }
                }
                var l = 0;
                for (var o = 0; o < e; o++) {
                    for (var n = 0; n < e; n++) {
                        if (t.isDark(n, o)) {
                            l++
                        }
                    }
                }
                var f = Math.abs(100 * l / e / e - 50) / 5;
                r += f * 10;
                return r
            }
        };
        var u = {
            glog: function (t) {
                if (t < 1) {
                    throw new Error("glog(" + t + ")")
                }
                return u.LOG_TABLE[t]
            }, gexp: function (t) {
                while (t < 0) {
                    t += 255
                }
                while (t >= 256) {
                    t -= 255
                }
                return u.EXP_TABLE[t]
            }, EXP_TABLE: new Array(256), LOG_TABLE: new Array(256)
        };
        for (var s = 0; s < 8; s++) {
            u.EXP_TABLE[s] = 1 << s
        }
        for (var s = 8; s < 256; s++) {
            u.EXP_TABLE[s] = u.EXP_TABLE[s - 4] ^ u.EXP_TABLE[s - 5] ^ u.EXP_TABLE[s - 6] ^ u.EXP_TABLE[s - 8]
        }
        for (var s = 0; s < 255; s++) {
            u.LOG_TABLE[u.EXP_TABLE[s]] = s
        }

        function h(t, e) {
            if (t.length == undefined) {
                throw new Error(t.length + "/" + e)
            }
            var r = 0;
            while (r < t.length && t[r] == 0) {
                r++
            }
            this.num = new Array(t.length - r + e);
            for (var n = 0; n < t.length - r; n++) {
                this.num[n] = t[n + r]
            }
        }

        h.prototype = {
            get: function (t) {
                return this.num[t]
            }, getLength: function () {
                return this.num.length
            }, multiply: function (t) {
                var e = new Array(this.getLength() + t.getLength() - 1);
                for (var r = 0; r < this.getLength(); r++) {
                    for (var n = 0; n < t.getLength(); n++) {
                        e[r + n] ^= u.gexp(u.glog(this.get(r)) + u.glog(t.get(n)))
                    }
                }
                return new h(e, 0)
            }, mod: function (t) {
                if (this.getLength() - t.getLength() < 0) {
                    return this
                }
                var e = u.glog(this.get(0)) - u.glog(t.get(0));
                var r = new Array(this.getLength());
                for (var n = 0; n < this.getLength(); n++) {
                    r[n] = this.get(n)
                }
                for (var n = 0; n < t.getLength(); n++) {
                    r[n] ^= u.gexp(u.glog(t.get(n)) + e)
                }
                return new h(r, 0).mod(t)
            }
        };

        function l(t, e) {
            this.totalCount = t;
            this.dataCount = e
        }

        l.RS_BLOCK_TABLE = [[1, 26, 19], [1, 26, 16], [1, 26, 13], [1, 26, 9], [1, 44, 34], [1, 44, 28], [1, 44, 22], [1, 44, 16], [1, 70, 55], [1, 70, 44], [2, 35, 17], [2, 35, 13], [1, 100, 80], [2, 50, 32], [2, 50, 24], [4, 25, 9], [1, 134, 108], [2, 67, 43], [2, 33, 15, 2, 34, 16], [2, 33, 11, 2, 34, 12], [2, 86, 68], [4, 43, 27], [4, 43, 19], [4, 43, 15], [2, 98, 78], [4, 49, 31], [2, 32, 14, 4, 33, 15], [4, 39, 13, 1, 40, 14], [2, 121, 97], [2, 60, 38, 2, 61, 39], [4, 40, 18, 2, 41, 19], [4, 40, 14, 2, 41, 15], [2, 146, 116], [3, 58, 36, 2, 59, 37], [4, 36, 16, 4, 37, 17], [4, 36, 12, 4, 37, 13], [2, 86, 68, 2, 87, 69], [4, 69, 43, 1, 70, 44], [6, 43, 19, 2, 44, 20], [6, 43, 15, 2, 44, 16], [4, 101, 81], [1, 80, 50, 4, 81, 51], [4, 50, 22, 4, 51, 23], [3, 36, 12, 8, 37, 13], [2, 116, 92, 2, 117, 93], [6, 58, 36, 2, 59, 37], [4, 46, 20, 6, 47, 21], [7, 42, 14, 4, 43, 15], [4, 133, 107], [8, 59, 37, 1, 60, 38], [8, 44, 20, 4, 45, 21], [12, 33, 11, 4, 34, 12], [3, 145, 115, 1, 146, 116], [4, 64, 40, 5, 65, 41], [11, 36, 16, 5, 37, 17], [11, 36, 12, 5, 37, 13], [5, 109, 87, 1, 110, 88], [5, 65, 41, 5, 66, 42], [5, 54, 24, 7, 55, 25], [11, 36, 12], [5, 122, 98, 1, 123, 99], [7, 73, 45, 3, 74, 46], [15, 43, 19, 2, 44, 20], [3, 45, 15, 13, 46, 16], [1, 135, 107, 5, 136, 108], [10, 74, 46, 1, 75, 47], [1, 50, 22, 15, 51, 23], [2, 42, 14, 17, 43, 15], [5, 150, 120, 1, 151, 121], [9, 69, 43, 4, 70, 44], [17, 50, 22, 1, 51, 23], [2, 42, 14, 19, 43, 15], [3, 141, 113, 4, 142, 114], [3, 70, 44, 11, 71, 45], [17, 47, 21, 4, 48, 22], [9, 39, 13, 16, 40, 14], [3, 135, 107, 5, 136, 108], [3, 67, 41, 13, 68, 42], [15, 54, 24, 5, 55, 25], [15, 43, 15, 10, 44, 16], [4, 144, 116, 4, 145, 117], [17, 68, 42], [17, 50, 22, 6, 51, 23], [19, 46, 16, 6, 47, 17], [2, 139, 111, 7, 140, 112], [17, 74, 46], [7, 54, 24, 16, 55, 25], [34, 37, 13], [4, 151, 121, 5, 152, 122], [4, 75, 47, 14, 76, 48], [11, 54, 24, 14, 55, 25], [16, 45, 15, 14, 46, 16], [6, 147, 117, 4, 148, 118], [6, 73, 45, 14, 74, 46], [11, 54, 24, 16, 55, 25], [30, 46, 16, 2, 47, 17], [8, 132, 106, 4, 133, 107], [8, 75, 47, 13, 76, 48], [7, 54, 24, 22, 55, 25], [22, 45, 15, 13, 46, 16], [10, 142, 114, 2, 143, 115], [19, 74, 46, 4, 75, 47], [28, 50, 22, 6, 51, 23], [33, 46, 16, 4, 47, 17], [8, 152, 122, 4, 153, 123], [22, 73, 45, 3, 74, 46], [8, 53, 23, 26, 54, 24], [12, 45, 15, 28, 46, 16], [3, 147, 117, 10, 148, 118], [3, 73, 45, 23, 74, 46], [4, 54, 24, 31, 55, 25], [11, 45, 15, 31, 46, 16], [7, 146, 116, 7, 147, 117], [21, 73, 45, 7, 74, 46], [1, 53, 23, 37, 54, 24], [19, 45, 15, 26, 46, 16], [5, 145, 115, 10, 146, 116], [19, 75, 47, 10, 76, 48], [15, 54, 24, 25, 55, 25], [23, 45, 15, 25, 46, 16], [13, 145, 115, 3, 146, 116], [2, 74, 46, 29, 75, 47], [42, 54, 24, 1, 55, 25], [23, 45, 15, 28, 46, 16], [17, 145, 115], [10, 74, 46, 23, 75, 47], [10, 54, 24, 35, 55, 25], [19, 45, 15, 35, 46, 16], [17, 145, 115, 1, 146, 116], [14, 74, 46, 21, 75, 47], [29, 54, 24, 19, 55, 25], [11, 45, 15, 46, 46, 16], [13, 145, 115, 6, 146, 116], [14, 74, 46, 23, 75, 47], [44, 54, 24, 7, 55, 25], [59, 46, 16, 1, 47, 17], [12, 151, 121, 7, 152, 122], [12, 75, 47, 26, 76, 48], [39, 54, 24, 14, 55, 25], [22, 45, 15, 41, 46, 16], [6, 151, 121, 14, 152, 122], [6, 75, 47, 34, 76, 48], [46, 54, 24, 10, 55, 25], [2, 45, 15, 64, 46, 16], [17, 152, 122, 4, 153, 123], [29, 74, 46, 14, 75, 47], [49, 54, 24, 10, 55, 25], [24, 45, 15, 46, 46, 16], [4, 152, 122, 18, 153, 123], [13, 74, 46, 32, 75, 47], [48, 54, 24, 14, 55, 25], [42, 45, 15, 32, 46, 16], [20, 147, 117, 4, 148, 118], [40, 75, 47, 7, 76, 48], [43, 54, 24, 22, 55, 25], [10, 45, 15, 67, 46, 16], [19, 148, 118, 6, 149, 119], [18, 75, 47, 31, 76, 48], [34, 54, 24, 34, 55, 25], [20, 45, 15, 61, 46, 16]];
        l.getRSBlocks = function (t, e) {
            var r = l.getRsBlockTable(t, e);
            if (r == undefined) {
                throw new Error("bad rs block @ typeNumber:" + t + "/errorCorrectLevel:" + e)
            }
            var n = r.length / 3;
            var o = new Array;
            for (var a = 0; a < n; a++) {
                var i = r[a * 3 + 0];
                var u = r[a * 3 + 1];
                var s = r[a * 3 + 2];
                for (var h = 0; h < i; h++) {
                    o.push(new l(u, s))
                }
            }
            return o
        };
        l.getRsBlockTable = function (t, e) {
            switch (e) {
                case o.L:
                    return l.RS_BLOCK_TABLE[(t - 1) * 4 + 0];
                case o.M:
                    return l.RS_BLOCK_TABLE[(t - 1) * 4 + 1];
                case o.Q:
                    return l.RS_BLOCK_TABLE[(t - 1) * 4 + 2];
                case o.H:
                    return l.RS_BLOCK_TABLE[(t - 1) * 4 + 3];
                default:
                    return undefined
            }
        };

        function f() {
            this.buffer = new Array;
            this.length = 0
        }

        f.prototype = {
            get: function (t) {
                var e = Math.floor(t / 8);
                return (this.buffer[e] >>> 7 - t % 8 & 1) == 1
            }, put: function (t, e) {
                for (var r = 0; r < e; r++) {
                    this.putBit((t >>> e - r - 1 & 1) == 1)
                }
            }, getLengthInBits: function () {
                return this.length
            }, putBit: function (t) {
                var e = Math.floor(this.length / 8);
                if (this.buffer.length <= e) {
                    this.buffer.push(0)
                }
                if (t) {
                    this.buffer[e] |= 128 >>> this.length % 8
                }
                this.length++
            }
        }
    })(window);
    (function (t) {
        var e = function (t) {
            var e = new QRCode(t.typeNumber, t.correctLevel);
            e.addData(t.text);
            e.make();
            var r = document.createElement("canvas");
            r.width = t.width;
            r.height = t.height;
            var n = r.getContext("2d");
            var o = t.width / e.getModuleCount();
            var a = t.height / e.getModuleCount();
            for (var i = 0; i < e.getModuleCount(); i++) {
                for (var u = 0; u < e.getModuleCount(); u++) {
                    n.fillStyle = e.isDark(i, u) ? t.foreground : t.background;
                    var s = Math.ceil((u + 1) * o) - Math.floor(u * o);
                    var h = Math.ceil((i + 1) * o) - Math.floor(i * o);
                    n.fillRect(Math.round(u * o), Math.round(i * a), s, h)
                }
            }
            var l = new Image;
            l.src = r.toDataURL("image/png");
            return l
        };
        var r = function (t) {
            var e = new QRCode(t.typeNumber, t.correctLevel);
            e.addData(t.text);
            e.make();
            var r = document.createElement("canvas");
            r.width = t.width;
            r.height = t.height;
            var n = r.getContext("2d");
            var o = t.width / e.getModuleCount();
            var a = t.height / e.getModuleCount();
            for (var i = 0; i < e.getModuleCount(); i++) {
                for (var u = 0; u < e.getModuleCount(); u++) {
                    n.fillStyle = e.isDark(i, u) ? t.foreground : t.background;
                    var s = Math.ceil((u + 1) * o) - Math.floor(u * o);
                    var h = Math.ceil((i + 1) * o) - Math.floor(i * o);
                    n.fillRect(Math.round(u * o), Math.round(i * a), s, h)
                }
            }
            return r
        };
        var n = function (e) {
            var r = new QRCode(e.typeNumber, e.correctLevel);
            r.addData(e.text);
            r.make();
            var n = t("<table></table>").css("width", e.width + "px").css("height", e.height + "px").css("border", "0px").css("border-collapse", "collapse").css("background-color", e.background);
            var o = e.width / r.getModuleCount();
            var a = e.height / r.getModuleCount();
            for (var i = 0; i < r.getModuleCount(); i++) {
                var u = t("<tr></tr>").css("height", a + "px").appendTo(n);
                for (var s = 0; s < r.getModuleCount(); s++) {
                    t("<td></td>").css("width", o + "px").css("background-color", r.isDark(i, s) ? e.foreground : e.background).appendTo(u)
                }
            }
            return n
        };
        var o = {canvas: r, image: e, table: n};
        t.fn.qrcode = function (e) {
            if (typeof e === "string") {
                e = {text: e}
            }
            e = t.extend({}, {
                render: "canvas",
                width: 256,
                height: 256,
                typeNumber: -1,
                correctLevel: QRErrorCorrectLevel.H,
                background: "#fff",
                foreground: "#000"
            }, e);
            return this.each(function () {
                var r = e.render in o ? o[e.render](e) : o["table"](e);
                t(r).appendTo(this)
            })
        }
    })($);
});