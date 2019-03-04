(function (factory) {
    "use strict";
    layui.define(function (exports) {
        exports('pinyin', factory());
    })
}(function () {
    var CompareStrings = {

        db: '吖阿啊锕錒嗄哎哀埃唉欸溾锿鎄挨捱啀皑娾凒嵦溰嘊敱皚癌毐昹矮蔼躷濭藹霭譪靄艾伌砹爱硋隘塧碍嗳嗌愛嫒瑷叆暧僾壒鴱薆噯懓嬡璦賹曖瞹馤皧礙鑀譺鱫安侒峖桉氨庵谙葊萻啽媕鹌腤痷蓭誝鞍鞌盦諳闇馣鮟盫鵪韽鶕雸垵俺埯唵铵隌揞晻罯銨犴岸按荌洝豻胺案堓婩暗貋儑錌黯肮骯岇枊昂昻盎醠凹柪軪爊敖厫隞嗸嶅遨蔜嗷獓廒滶璈獒摮熬磝聱螯翱謷翶鳌翺鏖鷔鰲鼇芺袄镺媪媼襖扷抝岙垇坳岰奡傲奥嫯骜奧慠擙嶴澳懊謸鏊驁八丷仈巴扒叭玐朳芭夿岜疤捌蚆哵笆釟釛羓粑紦豝鲃魞犮叐抜坺拔茇妭胈炦癹菝軷跋詙魃颰墢鼥把靶坝弝爸垻罢鲅罷鮁覇矲霸壩灞欛吧挀掰白百佰柏栢瓸捭竡粨絔摆擺襬庍拝败拜敗稗粺薭贁韛扳攽班般颁斑搬頒斒瘢癍辬阪坂岅板瓪昄版钣覂舨粄鈑蝂魬闆办半伴坢拌怑姅绊秚湴絆跘鉡靽辦瓣扮邦帮垹捠梆浜邫幇幚幫鞤绑綁榜牓玤蚌棒棓硥傍谤塝蒡稖蜯磅镑艕縍謗鎊勹包佨苞孢胞笣龅煲蕔褒闁襃齙窇雹薄宀饱怉宝保鸨珤堢葆堡媬飹飽寚駂褓鳵鴇緥賲藵寳寶靌勽报抱趵铇豹菢袌報鉋鲍靤骲髱暴虣鮑曓儤爆忁鑤萡陂杯卑盃桮揹悲碑鹎藣鵯北鉳贝孛邶貝狈苝昁牬备背钡俻倍狽悖被珼梖鄁偝偹琲辈軰備僃惫焙蓓愂碚蛽禙骳犕誖褙輩鋇憊糒鞴鐾呗唄奔泍贲倴逩喯渀賁犇锛錛本夲苯奙畚翉楍坌捹桳笨撪輽伻挷奟崩绷閍絣嵭傰痭嘣綳繃甭埲菶琫琣鞛泵迸逬跰塴甏镚蹦鏰皀屄悂偪逼毴鈚楅榌豍鵖鲾鎞鰏柲荸鼻嬶匕比朼夶吡佊疕沘妣彼柀秕粊笔俾舭粃娝啚筆鄙聛貏魮币必毕闭坒佖庇邲诐苾枈畀畁怭妼珌荜毖哔疪陛毙畢铋狴袐萞萆梐閉閇庳敝婢堛皕貱赑筚詖湢愊愎禆弻弼蓽蓖閟跸蜌嗶鉍飶腷痹痺煏滭滗裨彃碧鞁蔽稫馝箅箆獙弊幣熚鄪綼髲駜幤罼獘潷襅薜觱篳篦鮅廦壁避嬖縪鞞蹕髀斃濞臂奰鏎饆鄨璧鞸魓襣襞繴韠驆躃躄鷝贔鐴鷩鸊鼊边砭笾萹猵编牑煸蝙箯編鞕邉鍽鳊獱鞭邊鯾鯿籩釆贬炞疺窆扁匾貶惼碥稨褊糄鴘藊鶣卞弁抃苄汳汴忭玣峅变昪便変覍揙徧遍缏閞辡艑頨緶辨辩辧辫辮辯變标飑骉髟彪淲猋脿墂摽蔈幖颮滮骠標膘麃熛磦飙镖飚瘭儦颷藨謤瀌贆爂鏢臕镳穮驃飆飇飈飊鑣驫嫑表婊裱諘錶褾檦俵鳔鰾憋鳖鱉鼈虌龞別别咇莂蛂徶襒蟞蹩瘪癟彆汃邠玢砏宾彬椕傧斌滨缤瑸槟豩賓賔镔儐濒豳虨濱濵璸檳霦瀕繽鑌顮氞摈髩殡膑鬂擯殯臏髌鬓髕鬢仌仒氷冰兵栟掤梹鋲丙邴陃抦苪秉怲柄昞昺饼炳眪窉蛃棅鈵禀稟鞆鉼餅餠癝癛疒并幷併並垪庰栤倂病竝偋摒傡寎誁鮩靐癶拨波玻砵盋钵饽袚袯剥剝菠缽紴溊鉢碆僠播撥嶓餑磻蹳驋鱍仢伯犻驳苩帛瓝狛泊柭郣勃侼胉挬钹铂秡瓟亳浡桲舶脖淿博葧鹁湐渤搏鈸鉑鲌猼馎愽駁僰馛箔牔艊膊煿踣镈鋍駮馞壆鮊豰襏鵓礡簙鎛餺懪髆髉犦欂襮礴鑮跛箥孹檗擘簸譒糪蘗卜啵蔔巭逋峬钸庯晡鈽誧轐卟补捕哺補鳪鵏鸔不布步吥佈抪歨歩咘怖柨钚埗捗荹部勏悑埠鈈瓿蔀廍踄餔郶篰餢醭簿攃擦礤礸遪猜才材财財裁纔毝采倸採啋彩寀婇睬跴綵踩埰菜棌蔡縩参飡叄參骖喰湌叅飱傪嵾餐嬠爘驂残蚕惭殘蝅慚慙蠺蠶惨慘憯黪黲灿粲儏薒澯璨燦謲仓仺伧苍沧鸧舱倉凔蒼嵢獊滄螥艙濸鶬匨蔵藏欌鑶賶撡操糙曺曹傮蓸嘈嶆漕慒槽褿螬艚鏪艹艸草愺騲肏襙刂冊册厕侧拺荝测恻敇萗厠笧側粣萴策廁測惻蓛筞墄箣憡岑笒涔梣噌层曽曾嶒層竲驓蹭叉扱扠芆杈肞臿挿訍偛插揷嗏馇锸銟艖嚓鍤鎈餷秅垞茬茶查査搽靫嵖猹槎詧摖碴察褨檫衩镲鑔汊奼岔侘刹诧差姹紁詫拆钗釵疀犲侪重柴豺祡喍儕虿袃瘥蠆囆觇梴掺搀覘裧摻鋓幨襜攙辿谗婵棎馋湹禅孱煘缠蝉僝鋋獑誗儃廛潹潺嬋緾磛澶禪毚鄽襌蟬瀍蟾儳劖酁繵壥嚵巉瀺欃纏躔镵纒艬讒鑱饞产刬旵丳浐谄啴铲產産阐蒇剷嵼滻蕆閳幝諂骣燀簅醦冁繟鏟譂闡囅讇灛忏剗硟摲懴颤懺羼韂顫伥昌倀菖猖阊淐娼琩椙晿锠裮閶錩鲳鯧鼚仧仩镸苌兏肠長尝瓺萇常偿徜場甞腸塲嘗嫦瑺膓鋿蟐嚐償鲿鏛鱨厂场昶惝敞厰僘廠氅鋹怅畅倡鬯唱悵暢畼誯韔抄怊弨钞欩訬绰超鈔焯繛牊晁巣巢朝鼌鄛漅樔嘲潮窲罺轈鼂謿吵炒眧煼麨巐仦仯耖觘车伡車砗莗唓硨蛼伬扯偖撦奲屮彻坼迠烢烲聅硩掣頙摰撤徹澈瞮勶爡抻郴琛棽嗔綝瞋賝諃謓臣尘辰沉忱陈迧茞莀莐宸陳軙敐晨訦谌揨鈂愖蔯煁樄瘎塵霃諶螴薼麎曟鷐趻硶碜墋夦磣踸贂衬疢龀趁趂榇齓齔儭嚫谶櫬襯讖傖阷泟柽爯琤棦称浾蛏偁赪靗摚稱憆撐撑緽頳赬橕瞠檉罉蟶穪鏿鐣鏳饓朾成丞呈枨郕诚承城荿峸乗洆宬娍珹埕挰乘脀珵掁碀铖脭窚堘棖程筬惩椉裎絾塖塍誠溗酲畻鋮澂澄憕檙橙鯎瀓懲騬侱逞徎悜骋庱睈騁秤牚竀吃妛呮侙彨哧鸱蚩眵笞瓻粚喫摛嗤痴媸絺殦噄瞝螭鴟鵄魑癡齝攡麶彲黐池弛驰迟茌岻持竾耛赿蚳貾筂遅馳趍遟漦墀踟遲篪謘尺叺呎肔齿侈卶垑拸胣耻恥蚇豉袳歯袲欼裭鉹齒褫彳叱斥赤灻饬杘抶迣勅炽恜翅翄敕痓烾跅飭訵啻湁趐雴跮傺鉓腟痸遫銐翤憏慗瘛翨熾趩懘鶒饎鷘冲充沖忡茺珫浺翀舂摏嘃憃衝徸憧罿蹖艟虫崇痋崈隀漴褈蝩緟蟲爞宠喠寵铳揰銃抽紬搊醔篘瘳犨犫仇俦诪栦帱菗惆绸椆畴絒酬酧稠愁筹皗詶裯踌綢儔雔薵幬懤嬦雠燽疇籌醻躊讐讎丑丒吜杽侴偢瞅醜矁魗臭遚臰殠出岀初摴樗貙齣刍除芻蒢厨豠锄滁耡趎蒭蜍雏媰犓篨鋤廚橱櫉躇蟵幮雛櫥蹰鶵躕杵础椘楮储楚褚濋璴檚儲礎齭齼亍处処竌拀豖怵绌竐欪俶畜珿埱處觕絀琡傗鄐搐触滀閦踀嘼儊諔憷歜黜斶臅觸矗橻欻揣搋膗踹膪川巛氚穿剶传舡舩船遄圌猭瑏椽傳暷篅輲舛荈喘歂僢汌玔串钏釧賗刅疮窓窗牎摐牕瘡窻床牀噇闯傸磢闖创怆刱剏剙創愴吹炊龡垂桘埀倕陲捶菙搥棰腄槌锤箠錘顀鎚杶旾春萅堾媋瑃椿槆暙蝽箺橁輴櫄鶞鰆纯陙莼唇浱純脣淳犉湻蒓鹑滣漘醇醕錞鯙鶉偆萶惷睶賰踳蠢逴踔戳辵娕娖啜涰惙婥辍酫綽趠輟龊擉磭歠嚽齪齱鑡呲玼趀疵偨骴縒词珁茈茨柌垐祠瓷堲詞辝辞鈶甆慈磁雌鹚飺辤餈糍薋濨嬨鴜礠蠀辭鶿鷀此佌泚皉跐朿次刺刾佽茦庛栨莿蛓赐絘賜螆匆苁囪囱茐枞忩怱悤葱棇焧楤聡蔥蓯漗骢璁瑽聦聪樬樅暰熜緫瞛聰蟌篵謥繱騘鏦驄从丛従從徖淙悰孮婃琮潀潈漎賩誴潨賨樷藂叢灇欉爜憁凑湊楱辏腠輳粗麁麄麤徂殂促捽猝媨瘄趗蔟誎醋踧噈憱瘯簇縬鼀蹙蹴蹵顣汆撺镩蹿攛躥鑹攅櫕巑欑窜殩篡熶簒竄爨崔催凗墔摧榱嶉獕漼慛槯磪鏙璀趡皠伜忰疩脆脃翆萃啛啐淬悴琗椊毳焠瘁粹翠膵膬顇濢竁臎邨村皴膥竴存侟拵洊踆澊刌忖寸吋籿搓瑳遳磋撮醝蹉襊髊虘蒫睉嵯嵳矬痤蔖鹾鹺齹脞剉挫剒莡莝厝夎措逪棤锉蓌错銼錯咑垯耷哒畣搭嗒褡墶撘噠鎝达迏迖迚呾怛妲荙羍炟逹剳笪匒達答詚溚跶靼瘩薘鞑燵蟽繨鐽韃龖龘打大亣汏眔躂呆獃懛歹逮傣代轪甙侢垈岱帒迨绐玳带殆柋贷待怠帯軑埭帶蚮袋紿軩貸瑇廗叇曃緿鴏鮘戴黛艜蹛簤霴瀻黱襶靆亻卩丹妉担单瓭砃眈単耼耽郸聃酖躭殚單媅瘅匰頕鄲箪褝儋勯殫癉簞聸刐玬胆衴疸紞掸亶撣擔黕澸膽旦帎但狚泹诞沊柦訑疍萏啗啖淡惮弹蛋啿氮蜑腅觛蓞誕窞髧馾噉僤嘾憚彈駳鴠餤澹憺禫甔癚贉嚪霮饏当珰铛裆筜當噹澢璫襠蟷簹艡鐺挡档党谠擋檔黨攩灙欓讜氹圵凼砀宕垱荡菪瓽逿愓婸雼碭趤蕩瞊儅壋璗盪礑簜蘯譡闣刀叨忉朷氘虭舠釖鱽魛导岛陦捣倒島宲捯祷禂搗隝槝嶋嶌導隯壔擣蹈嶹禱到菿盗悼椡道盜稲翢稻衜艔噵檤衟翿軇瓙纛恴得淂惪悳锝嘚徳德鍀的揼扥扽灯登豋噔嬁璒燈竳簦艠蹬覴等戥邓僜隥凳鄧墱嶝磴瞪镫櫈鐙仾低奃彽袛埞啲羝隄趆堤嘀滴磾鍉鞮廸肑狄苖迪籴荻唙敌涤梑笛靮觌髢馰滌蔐蔋頔魡嫡敵镝篴藡藋嚁豴鏑糴鸐氐坘厎邸诋阺拞坻抵呧底弤柢牴砥掋菧軧觝詆楴聜骶鯳地弚玓杕旳坔弟枤怟俤帝埊逓递娣珶梊菂眱第偙釱啇焍祶谛揥蒂棣睇媂缔僀遞鉪腣禘摕墑蔕遰碲墬慸甋締踶嶳諦螮嗲敁掂厧傎嵮滇槙瘨颠蹎顛巅顚癫攧巔巓癲齻丶奌典点婰椣敟蒧碘蕇踮點嚸电佃甸阽坫店玷垫扂钿淀惦婝琔奠電蜔鈿殿墊靛橂澱壂磹簟癜驔刁叼汈刟凋奝蛁彫弴琱貂颩碉鳭瞗錭雕鲷鮉簓鼦鵰鯛扚屌弔吊伄钓訋窎掉铞铫釣罀鈟竨雿銱調鋽瘹窵鑃爹跌苵迭怢挕垤峌胅恎绖耊眣瓞戜啑谍镻堞揲臷趃耋喋畳幉詄惵絰殜牒牃叠碟蜨嵽褋蝶艓蹀疂諜褺鲽鮙曡疉鰈疊氎哋丁亇仃叮帄奵玎盯町甼疔耵虰釘靪顶酊頂鼎鼑嵿薡鐤订饤忊矴钉定訂飣萣啶铤椗腚碇锭聢碠蝊鋌錠磸顁丟丢铥銩东冬苳東咚岽昸氡鸫倲埬菄崬笗涷娻氭徚蝀鮗鼕鶇鯟鶫董墥蕫箽諌懂嬞动冻侗垌挏栋迵峒峝胨洞恫姛戙胴凍硐崠動棟腖湩働駧霘吺剅侸都唗兜兠蔸橷篼唞乧阧抖枓钭陡蚪斗豆郖荳逗鬥饾浢梪毭酘脰閗痘窦鬦鋀餖斣闘鬪竇鬭鬬剢阇督嘟醏闍毒独涜读渎椟犊牍裻読蝳錖獨匵凟瀆嬻瓄櫝殰犢牘騳皾黩襩髑豄贕讀韣鑟韇韥黷讟厾笃堵帾琽暏赌睹覩賭篤芏杜肚妒妬度荰秺靯渡镀螙殬鍍蠧蠹剬偳媏端褍鍴短段断塅葮缎瑖椴腶煅碫锻緞縀毈簖鍛斷躖籪垖堆塠嵟痽磓鴭頧队对兊兌対兑祋怼陮隊碓綐對憝薱濧懟譈瀩譵吨惇敦蜳墩撴壿獤墪橔噸犜撉燉礅镦蹾蹲鐓鐜驐盹趸躉伅沌炖逇砘钝盾顿遁鈍楯頓腞碷遯潡憞踲多夛咄茤哆剟掇崜敠毲敪裰嚉仛夺铎敓剫敚喥鈬痥奪凙踱鮵鐸朵朶垛挆挅哚埵缍趓椯躲躱綞亸鬌嚲剁饳陏陊刴垜柮尮桗舵堕惰媠跺跢跥飿憜墮嶞嫷墯鵽妸妿屙娿婀讹迗吪囮俄莪峨峩涐娥珴訛睋锇鹅皒鈋蛾磀誐鋨魤頟额騀鵝鵞額譌枙砈噁鵈厄歺屵戹岋阨扼苊呃阸砐轭呝垩咢咹峉姶恶砨蚅匎饿堊軛悪硆卾鄂偔阏谔堮惡萼軶豟遏遌崿鈪湂愕搹琧腭詻廅蝁鹗锷僫蕚颚遻餓頞擜噩覨餩諤鍔鳄歞顎蘁櫮鶚鰐讍齶鑩鱷诶奀恩蒽煾峎摁嗯鞥儿而児侕兒陑荋耏咡峏洏栭胹鸸唲袻聏粫輀鲕髵隭鴯鮞轜尓尒尔耳迩饵洱珥毦栮铒衈爾鉺餌駬薾邇趰二弍弐刵佴贰貮貳誀樲发沷発發彂廢橃醗乏伐姂茷罚垡阀栰笩筏傠閥罰瞂罸藅佱法砝鍅灋珐琺髪髮帆忛犿番勫墦蕃噃幡憣嬏旙藩翻旛颿轓籓飜鱕凣凢凡杋匥柉矾钒籵舤舧烦笲釩棥煩緐樊璠薠橎膰燔繁襎羳繙蹯蘩礬瀪鐇瀿蠜鷭犭攵反払辺仮返犯氾奿汎饭泛范贩畈軓訉梵販笵盕飯飰軬滼範嬎嬔匚方邡坊芳汸枋牥祊钫蚄淓趽鈁錺鴋防妨肪房埅堏鲂魴仿访纺昉昘瓬眆倣舫旊紡訪髣鶭放飞妃非飛菲婓啡渄婔绯猆靟暃扉裶蜚緋霏鲱餥馡騑騛鯡飝肥淝腓蜰裵蟦胇朏胐匪诽陫奜悱棐斐榧翡蕜誹篚芾吠杮肺狒废沸昲费厞剕俷疿萉屝廃費痱镄蕟曊鼣癈濷櫠鐨靅分芬吩帉妢纷瓰昐氛竕衯翂紛棻兝酚躮訜雰鈖餴朆饙坆坟岎汾枌炃朌肦蚡蚠羒梤棼焚蒶馚隫蕡鳻魵燓豮燌鼢鼖羵轒豶鐼馩黂粉瞓黺份坋弅奋忿秎偾粪愤僨墳幩獖憤橨奮膹鲼糞瀵鱝丰风仹凨凬沣沨妦枫肨凮炐封砜盽風疯埄峯峰琒桻偑烽葑崶锋猦犎楓蜂碸瘋鄷僼鋒檒豐鎽鏠酆蘴灃寷蠭飌靊麷冯夆捀逢浲堸舽馮溄渢摓艂漨缝綘篈縫讽唪諷凤奉甮俸焨湗赗鳯煈鳳鴌賵覅仏佛坲梻紑缶否妚缻缹雬鴀夫邞伕呋沕妋玞姇肤荂砆怤衭垺荴尃娐麸旉趺紨跗稃鈇筟鄜綒豧孵鳺麩敷膚麬糐麱懯乀巿弗伏甶凫扶芙芣孚冹刜拂苻茀枎咈帗岪彿服泭怫绂绋玸韨垘茯枹柫畐畉罘氟俘鳬郛炥洑祓莩栿砩蚨哹畗浮琈菔桴虙符笰匐烰涪艴翇紱紼葍棴幅罦絥辐蜉鳧艀鉜鉘颫粰福綍榑酻稪箙韍髴蝠幞鴔澓輻踾鮄諨黻鮲癁襆鵩襥鶝抚甫拊斧府弣郙俌胕俯釜釡捬酜辅椨盙腑焤滏輔腐撫鬴簠黼父讣付负妇附坿咐阜竎驸赴柎复峊負訃祔蚥袝陚副蚹偩冨婏婦萯軵覄赋秿傅蛗復詂富媍椱腹鲋缚赙褔複禣駙蕧賦蝮蝜緮輹鮒縛賻鍢鍑鳆覆馥鰒袱旮伽呷嘎钆尜噶嘠錷玍尕尬魀侅郂该陔垓荄峐姟晐赅畡祴隑絯豥賅該賌忋改絠鎅丐乢匃匄杚钙盖摡葢鈣溉蓋概槩戤漑槪瓂甘迀芉忓玕攼肝坩苷矸泔玵乹柑虷竿酐疳粓亁凲尴尲筸鳱漧尶尷魐仠扞杆秆衦皯赶桿笴敢稈感趕澉橄擀簳鳡鱤干旰汵盰绀倝凎淦紺骭詌幹榦檊赣贛灨冈罓冮刚肛纲矼岡牨疘钢缸罡剛堈崗釭棡犅堽碙罁綱鋼鎠岗港杠掆焵焹筻槓戆皋高羙羔皐髙臯睪滜槔睾膏槹橰篙糕餻櫜韟鼛鷎鷱夰杲菒稁搞筶缟槁獔槀镐稿稾縞藁藳檺鎬吿告郜勂诰峼祮祰锆暠誥禞鋯戈圪犵纥戓肐牫疙咯牱哥胳鸽袼搁割滒彁戨歌鴚擱鴿謌鎶呄佮匌挌革茖阁格鬲敋臵蛒愅裓隔塥嗝觡滆槅閤閣搿膈鞈骼镉韐輵臈諽鮯櫊鎘韚騔轕鞷鰪哿舸葛嗰个各虼個硌铬箇鉻獦给給根跟哏亘亙艮茛搄揯刯庚畊耕浭菮椩赓焿絚鹒賡羮縆緪鶊羹郠埂挭耿莄哽峺绠梗綆鲠骾鯁更堩工弓厷公功攻杛肱糼宫恭蚣躬宮龚匑塨幊躳觥愩碽匔髸兣篢觵龏龔廾巩汞拱珙拲栱輁鞏共贡供羾貢唝慐熕贑勾抅佝沟泃钩冓鈎缑鉤溝褠緱篝鞲簼韝芶苟岣狗玽耇耉枸耈蚼笱豿坸构购诟垢茩姤袧够夠傋訽遘搆彀雊詬媾觏構煹撀覯購估咕沽泒孤姑柧轱鸪唂罛菰菇蛄笟蓇辜軲軱酤嗗觚毂鈲箍箛篐嫴鴣橭鮕轂夃古扢抇谷汩诂股骨牯唃罟钴逧羖蛊蛌啒傦脵淈尳焸馉詁愲鼓鼔榾鈷皷榖嘏鹘穀縎糓薣皼餶臌濲瞽盬瀔鶻蠱固故怘顾凅堌梏崓崮牿棝雇祻頋锢稒痼僱錮鲴鯝顧瓜苽呱刮胍鸹颪歄焻煱劀緺銽鴰騧叧冎剐剮寡卦坬诖挂掛啩罣絓罫詿褂乖拐枴柺箉怪恠噲关观官覌倌萖蒄棺窤関瘝闗観鳏癏關鰥觀鱞欟莞馆筦痯管輨舘錧館鳤卝毌丱贯泴冠掼涫悺惯婠貫悹祼摜潅慣遦樌盥雚罆躀鏆灌瓘爟鹳礶矔罐鑵鸛鱹光灮炗炚侊炛垙挄茪咣洸姯珖胱烡硄輄僙銧黆广広犷廣獷臩俇桄逛臦撗归圭龟妫规邽茥皈闺珪帰胿規硅亀窐袿椝媯瑰郌嫢摫閨鲑槼槻螝嶲嬀璝瞡膭龜鮭竃鬶巂歸騩瓌鬹櫷氿宄轨庋匦佹诡陒垝軌鬼恑姽癸庪祪匭晷蛫湀觤詭厬簋蟡攰昋柜炅刿刽贵攱桂桧椢貴筀猤蓕跪溎撌槶劌劊瞶簂禬櫃襘鳜鞼鱖鱥衮袞惃绲辊蓘滚裷蔉滾緄輥磙鲧緷鮌鯀琯棍睔睴璭謴呙埚郭啯崞聒楇锅鈛墎瘑蝈嘓濄鍋蟈鐹囯国囶囻圀掴國帼腘摑聝蔮幗漍慖虢馘果菓猓馃淉惈椁褁槨蜾裹粿綶輠餜过過腂哈铪鉿蛤还孩骸還胲海烸塰酼醢亥骇氦害嗐餀駭駴嚡饚佄顸哻蚶頇酣谽嫨憨馠魽鼾邗邯含咁肣函凾唅浛娢圅琀梒晗崡焓涵韩嵅寒甝筨蜬鋡澏韓厈罕浫喊蔊豃闞鬫汉屽闬汗旱垾捍莟猂涆悍菡晘閈釬焊淊睅皔馯蛿傼颔撖蜭漢暵銲鋎熯撼螒翰頷澣憾駻顄雗譀瀚鶾爳夯行苀迒杭斻垳绗蚢笐航颃貥筕絎頏魧沆蒿薅嚆毜呺竓蚝毫椃嗥獆噑豪虠嘷獋諕儫壕嚎濠蠔籇譹好郝号昊昦秏耗哠浩悎恏晧淏傐皓鄗聕號滈暤暭皞皜澔薃曍皡翯皥颢顥鰝灏灝诃抲呵欱喝訶嗬蠚禾合何咊和劾河姀柇盇曷峆狢饸阂籺紇盍荷核哬盉萂菏龁啝秴盒渮涸惒颌訸粭楁毼鉌貈鲄詥阖澕閡熆頜翮篕魺餲鞨礉齕闔覈皬鑉龢佫垎贺焃寉賀碋嗃煂赫麧鹖熇褐鹤壑癋爀燺鶡鶴齃靍鸖靎靏黒黑嗨嘿潶拫痕鞎佷很狠詪恨亨哼涥悙脝恒恆姮珩桁胻烆鸻横橫衡鴴鵆蘅鑅啈堼叿灴轰訇烘軣揈焢渹谾薨輷嚝鍧轟仜弘屸妅红玒呍吰闳汯宏纮玜苰泓宖垬荭虹竑洪娂紅耾翃浤紘硔谹鸿紭葓葒硡閎舼鈜竤粠渱谼翝綋鞃鉷魟潂篊鋐蕻霐黉彋霟鴻黌哄晎嗊讧訌閧撔銾澒澋鬨闂闀齁侯矦葔喉帿猴睺銗瘊骺篌糇翭鍭餱鯸吽吼犼后郈厚垕逅後洉候鄇堠豞鲎鲘鮜鱟乊乎匢垀苸昒呼曶忽泘轷烀恗匫虖唿淴惚軤雽雐嘑滹寣歑幠膴謼囫狐弧瓳胡壶壷斛焀搰壺葫喖鹄猢湖媩絗瑚楜煳蔛鹕嘝槲蝴箶衚魱糊螜縠醐鴩頶觳鍸餬鵠鬍瀫鶘鶦鰗鶮虍乕汻虎浒俿萀唬許琥虝箎滸錿鯱戸互戶户弖冴冱护沍沪帍枑昈岵怙戽祜笏粐瓠扈婟綔鄠摢蔰滬嫮嫭槴熩鳸擭濩簄鍙嚛鹱護鳠韄頀鸌鱯花芲砉埖婲椛硴糀誮蕐錵蘤划华哗姡骅華铧猾滑撶嘩磆螖鋘鏵驊鷨化夻杹画话桦崋婳畫觟話畵嬅摦樺劃槬諣諙澅嫿黊舙繣蘳怀佪徊淮槐踝褢褱懐瀤懷櫰耲蘹坏咶壊壞蘾欢欥歓鴅懁鵍酄嚾獾懽歡貛讙驩环荁峘狟洹桓萈萑雈寏絙貆羦綄锾瞏圜阛澴寰缳環豲鍰鹮镮糫繯轘闤鬟瓛睆缓輐緩攌幻肒奂奐宦换唤圂烉涣浣梙患焕逭換喚嵈痪渙愌瑍豢煥瘓漶槵鲩擐藧鯇鰀鯶巟肓荒衁塃慌皇黄偟凰隍堭揘黃葟喤崲遑徨湟惶媓瑝楻煌墴锽獚潢璜蝗篁艎熿磺穔諻癀蟥簧鍠餭鳇趪韹騜鐄鰉鷬鱑怳炾恍晃晄宺奛谎幌詤熀謊縨櫎兤滉愰榥曂皝鎤皩灰灳诙拻挥虺咴洃恢袆珲豗晖烣婎揮辉隓媈翚楎暉詼煇禈睳幑輝噅噕麾翬徽隳瀈鰴囘回囬廻茴廽迴洄恛逥硘痐蛕蛔蜖鮰烠悔毀毁毇檓燬譭卉屶屷汇会讳泋荟哕浍诲芔绘恚恵贿烩彗晦秽惠喙翙阓湏缋絵匯賄颒會詯滙彚彙蔧嘒僡誨瘣慧蕙槥暳圚潓憓寭璤薉薈橞殨噦徻獩諱澮嬒璯藱檅檜篲餯燴嚖瞺蟪穢繢櫘翽譓繪闠儶鏸譮靧鐬韢孈顪譿昏荤昬阍涽惛婚葷棔殙惽睧睯閽忶浑馄混堚渾琿魂餛繉鼲诨俒倱掍焝溷慁觨諢吙剨耠锪劐鍃豁騞佸活秮秳趏火灬伙邩钬鈥漷夥沎或货咟捇获眓閄俰掝貨祸惑旤湱禍嗀蒦膕奯霍嚄獲檴雘謋矆镬穫耯攉藿嚯蠖艧瀖曤嚿臛矐鑊癨靃丌讥击叽刉饥玑圾芨机乩刏肌矶鸡枅咭剞唧积笄飢屐姬基赍攲敧喞犄嵆嵇筓缉畸跻嗘稘鳮毄箕僟銈樭賫槣撃踦嘰稽躸觭齑緝畿璣機墼積錤激憿禨隮鄿賷擊磯羁簊耭櫅雞鶏譏韲鐖饑譤鞿躋鷄癪齎虀羇鑇覉鑙齏羈鸄覊亼亽及伋吉岌彶汲忣级极即郆佶亟叝笈皍卽急姞級揤觙疾卙楖偮谻脨庴焏極棘殛戢集湒趌塉蒺楫辑蝍嵴愱嫉耤槉銡膌鞊蕀蕺踖嶯箿瘠鹡濈潗橶檝輯螏藉蹐簎鍓襋艥轚霵籍鏶鶺覿鷑躤雦雧几己丮犱妀泲虮挤脊掎鱾戟幾麂魢撠颳擠穖蟣彐彑旡计记伎纪坖技芰忌际妓季剂垍茍哜峜計迹洎济既紀畟觊記剤继紒萕梞硛偈旣徛祭済悸寄寂绩惎葪蔇臮塈勣裚蓟跡痵兾際継霁跽稩穊墍鲚誋漈漃禝暨諅暩稷鲫髻薊冀穄劑襀縘檕鮆覬罽濟績璾檵蹟鯽齌鵋蘎繫穧鯚廭癠糭懻骥蘮瀱鱀繼蘻霽鰿鰶鱭驥加抸宊拁佳泇迦珈挟枷浃毠埉痂浹家耞梜笳袈葭跏傢猳裌犌筴鉫腵嘉镓豭貑糘鴐鎵麚夹圿扴夾郏荚郟恝莢唊戛铗脥袷戞颊蛱跲蛺餄頬鋏頰鴶鵊甲岬玾胛叚贾钾斚假斝徦婽椵賈鉀槚榎瘕檟价驾架幏嫁榢稼價駕駱戋幵尖奸歼坚间戔冿肩艰姧姦监兼菅菺堅笺猏惤揃靬葏葌間犍牋傔湔缄瑊搛蒹椷椾碊豣睷煎缣監箋蕳蕑樫鲣鹣熞緘篯熸縑麉艱馢餰鞯鳒瀐礛殱覸鵳鰔瀸櫼譼殲韀鰹囏虃韉鑯囝拣枧茧柬俭挸捡笕倹梘检趼帴减剪湕揀堿検硷睑詃減裥瑐暕筧简弿骞谫絸戬碱戩彅儉翦撿錽襔藆檢鎆蹇謇襇襉繭礆瞼簡謭鬋鹸鰎蠒鹹鐗瀽騫鹻籛譾襺鹼见件見饯建荐贱牮剑珔栫俴健舰剣涧揵徤釼剱渐谏袸葥楗臶践跈锏毽腱旔溅寋鉴賎键蔪榗僭漸趝墹賤踐踺箭劍劎諓糋澗薦橺橌鋻鍵劒劔餞諫鞬鍳磵礀瞯螹擶濺繝覵鏩瀳艦鐧聻轞鑒鑑鑬鑳江茳将姜豇畕浆將葁摪翞僵螀漿壃薑彊缰橿殭鳉螿礓疅疆繮韁鱂讲奖桨蒋奨蔣奬槳獎耩膙講顜匞匠夅弜杢降洚绛袶弶絳畺酱滰摾嵹犟醤糡糨醬櫤謽艽芁交郊茮茭峧浇娇姣骄胶敎椒蛟焦焳跤嘄僬鲛蕉嶕嶣骹膠澆憢憍嬌膲燋礁穚鹪鮫轇蟭簥鐎驕鷮鷦櫵嚼纟糹臫角佼挢狡饺恔绞捁晈笅烄铰矫皎脚搅筊絞賋湬敫腳煍剿勦摷暞踋僥鉸餃撟撹劋儌潐敽敿徼缴璬曒矯蟜皦鵤譑繳孂纐攪鱎灚叫呌挍訆觉珓轿较窌教窖較滘斠酵嘂嘦漖噍噭燞獥嬓藠趭轎醮譥皭釂阶疖皆掲接菨秸痎階堦揭椄喈喼嗟街脻湝媘嫅煯鞂稭擑蝔嚌癤鶛孑卪尐兯节讦刦刧劫昅岊劼刼杰疌诘衱拮迼狤洁结莭桝桀訐捷掶崨偼袺婕絜颉蛣傑媫結楬睫蜐嵥節鉣魝詰楶滐截蓵榤碣鲒竭踕誱羯潔擳幯擮礍嶻鍻鮚櫭巀蠞蠘蠽姐毑媎飷觧解檞丯介戒芥吤岕庎忦妎玠斺屆届砎界畍疥诫衸蚧借悈徣堺琾楐蛶骱犗誡魪褯曁繲巾斤今钅兓金釒荕砛觔津衿矜珒埐矝紟琎惍琻筋堻璡黅鹶嶜襟仅卺巹紧堇菫厪锦僅谨蓳緊馑廑漌嫤瑾槿儘錦謹鏱饉伒劤尽进近妗劲枃侭荩勁浕晋晉赆烬浸進祲煡搢靳禁溍寖缙瑨墐慬盡觐歏殣僸凚噤濅賮縉壗藎嚍濜嬧璶覲燼贐齽仱巠坕茎京泾经荆荊秔亰莖涇菁殑猄旌旍惊婛経晶稉腈睛粳經聙兢精橸鲸鵛鯨鶁麖鼱驚麠井丼阱坓汫宑刭汬肼剄穽颈景儆璄擏幜憬璥璟憼頸暻燝蟼警陉妌径净弪迳俓胫浄陘婙逕倞徑痉凈竞弳桱梷脛竟竫淨婧葝敬痙竧傹靖静境踁獍誩頚靜曔镜瀞鏡競竸坰扃埛扄駉駫冋冏囧迥泂侰逈炯浻宭烱絅煚颎窘綗煛僒熲褧澃燛顈蘏蘔丩勼纠朻牞鸠究糺糾赳阄萛揪揂啾揫鳩摎樛鬏鬮九久乆乣汣奺玖杦灸舏韭镹酒紤韮匛旧臼畂咎疚柾柩桕倃救厩匓就廐廄舅僦廏慦殧舊鹫匶鯦麔欍齨鷲圧凥拘苴狙匊居驹俥捄挶砠眗罝疽痀陱掬梮崌涺娵婅婮琚椐跔锔腒雎裾蜛艍駒踘諊鴡鮈鞠鞫鶋局泦狊侷桔毩菊郹啹焗淗椈毱湨輂犑蓻閰跼粷趜躹鋦橘駶檋鵙蹫鵴蘜鶪巈鼰鼳驧弆咀沮莒矩举挙椇筥蒟榉龃榘聥踽舉擧櫸齟欅襷巨句讵拒苣岠邭洰怇姖坥拠歫具昛炬怚钜秬耟蚷俱倶倨粔烥冣袓剧埧据埾距詎惧焣跙犋鉅飓豦虡锯駏聚愳寠窭劇勮踞鮔屦壉據遽鋸澽懅窶颶屨貗簴醵躆鐻懼爠姢捐涓娟梋瓹脧鹃裐勬镌鋗鋑鞙鵑鎸鐫蠲呟卷巻埍捲菤锩錈臇奆劵帣弮倦狷桊勌悁绢鄄眷淃睊罥雋絭睠飬絹蔨慻餋獧羂撅撧噘屩屫亅孒孓夬叏氒决诀刔抉芵吷決妜玨玦泬珏挗砄虳疦绝捔蚗欮赽掘桷殌覐趹崛觖訣斍焆逫趉厥傕鈌覚絶絕駃瑴劂勪谲镼蕨蕝爴嶡嶥鴃獗瘚熦潏憰鴂璚橛橜憠镢爵臄蟨蟩蹷蹶譎爑鶌矍覺鐝鐍觼爝灍攫鷢玃戄彏欔龣矡躩貜钁倔军均抣汮君钧軍袀莙蚐菌桾皲鈞碅筠銁銞皸覠皹鲪麇鍕鮶麏麕呁俊郡陖捃埈峻隽馂浚骏珺晙焌葰棞畯竣蜠箟箘儁餕懏寯燇駿鵔鵘鵕攈攟咔咖哢喀衉卡佧垰胩裃鉲开奒揩開锎鐦剀凯垲闿恺铠蒈剴凱慨塏楷輆愷暟锴鍇闓鎧颽忾炌炏欬烗勓嘅愾鎎刊栞勘龛堪嵁戡龕冚坎侃砍莰埳偘惂欿塪歁槛輡轁檻顑轗竷看衎崁墈阚磡瞰矙闶粇康嵻漮慷嫝槺穅糠躿鏮鱇扛摃亢匟伉邟抗囥犺忼炕砊钪閌鈧尻嵪髛丂考攷拷洘栲烤薧铐犒銬鲓靠鮳鯌苛匼珂柯轲科胢牁趷钶疴蚵萪棵軻嵙痾颏搕嗑犐稞鈳窠薖榼颗磕瞌蝌樖頦醘顆髁礚壳咳殻揢翗嶱可坷岢炣渇敤嵑渴克刻兙剋勀勊峇恪客尅兛袔课娔堁兞氪骒缂兡锞溘愙碦課緙錁騍礊肎肯肻垦恳啃豤貇錹墾懇掯硍裉褃劥阬坑吭妔挳硁牼硜铿硻誙銵鍞鏗空倥埪崆涳悾硿箜躻錓鵼孔恐控鞚抠芤眍剾摳彄瞘口劶竘叩扣怐敂宼冦釦寇筘窛蔻蔲滱瞉簆鷇扝矻刳郀枯桍哭堀崫跍圐窟骷苦狜楛库俈绔秙庫焅袴喾裤絝瘔酷褲鮬嚳夸姱晇舿誇侉垮咵銙挎胯跨骻蒯擓巜圦凷块快侩郐哙狯脍塊筷鲙墤儈鄶獪廥膾旝糩鱠宽寛寬髋鑧髖梡欵款歀窽窾匡邼劻诓匩哐洭恇筐軭筺誆抂狂狅诳軖軠誑鵟夼儣懭邝圹纩旷况矿岲況昿贶框砿眖眶絋軦貺絖鉱鋛鄺壙黋曠懬爌礦矌穬纊鑛亏刲岿悝盔窥聧窺虧顝闚蘬奎晆逵頄馗鄈揆葵喹骙楏楑暌魁戣睽蝰頯藈櫆鍷鍨騤蘷夔虁巙躨尯傀頍跬煃磈蹞卼匮欳蒉喟馈溃愦愧媿匱瞆聩聭蕢嘳篑潰憒嬇樻謉餽聵簣籄鐀饋巋鑎坤昆堒菎晜崐崑猑堃裈婫琨髠焜髡鹍锟裩髨尡蜫潉褌瑻醌熴錕鲲騉臗鵾鯤鶤捆阃悃壸梱祵硱稇裍壼稛綑閫閸困涃睏扩拡括栝桰葀萿蛞筈阔煀廓彉噋頢髺擴鞟闊濶彍韕霩懖鞹鬠垃拉柆菈啦翋搚磖邋旯剌砬揦喇藞嚹腊溂楋揧辢蜡蝋瘌辣蝲鬎臘瓎镴鯻蠟鑞鞡来來俫莱郲崃倈徕涞萊梾逨唻崍徠猍庲淶婡琜棶铼筙箂錸顂騋鶆麳鯠勑赉睐赖睞賚誺頼賴濑鵣癞攋藾籁瀬瀨櫴癩襰籟兰岚拦栏婪葻嵐阑蓝谰厱澜褴篮儖斓藍闌镧燷燣懢襕璼譋襤攔蘭幱籃灆瀾繿欄斕礷襴囒籣灡欗躝讕鑭襽钄韊览浨揽缆榄罱漤醂壈覧懒擥懶嬾孄覽孏攬灠欖爦纜烂滥燗壏嚂濫爁蘫瓓爛爤糷啷郎勆郞狼阆欴琅蓈桹斏廊嫏瑯榔硠锒稂筤艆郒螂躴閬鋃鎯駺悢朗朖烺蓢塱樃誏朤埌崀浪蒗唥捞粩撈劳労牢狫窂哰崂浶铹痨勞僗嘮嶗憦朥憥磱癆醪蟧簩鐒顟髝耂老佬荖咾恅姥珯栳硓铑蛯銠橑鮱轑唠烙涝耢酪嗠嫪躼澇橯耮軂仂阞扐艻叻乐氻忇玏泐竻砳勒韷簕鳓鰳了饹餎雷蔂嫘缧畾檑縲镭瓃櫑羸礧蘲罍鐳轠靁壨虆鱩欙纝鼺耒厽诔垒塁絫傫誄蕌樏磊蕾磥儡藟壘癗矋櫐礨纍蠝灅蘽讄儽鑘鸓鑸肋泪类洡涙累淚酹銇頛頪擂錑攂礌颣類纇蘱禷嘞塄棱楞碐稜踜薐冷堎愣睖唎刕厘荲剓狸离骊琍菞梸瓼梨犁悡鹂喱棃犂剺蓠甅蜊睝筣艃漓缡璃孷嫠樆貍竰盠犛蔾鋫黎鲡糎褵罹錅篱縭醨蟍謧釐藜嚟邌鯏離斄鵹鯬鏫黧蘺囄蠫灕蠡廲孋鑗劙矖穲籬纚驪鸝鱺礼李里峛俚逦哩峲浬娌理锂裡豊裏粴鋰鲤澧禮鯉蟸醴鳢邐欐鱧欚力历厉屴立朸吏坜苈叓丽励呖利沥苙枥岦例疠沴戾隶赲茘荔栃栎郦砅轹俪俐疬珕莉莅栵栛栗砺砾秝猁涖悧娳婯蛎蚸唳笠脷粝粒悷棙厤雳跞蛠詈傈凓痢塛搮蒚蒞厯鳨鉝溧慄瑮厲歴暦蜧綟隷勵歷曆篥鴗鬁隸檪磿巁癘濿櫔曞蠇犡儮爄禲瓅壢攊藶櫟麗礪嚦瀝瓑櫪礫蠣皪糲爏盭鷅酈礰儷癧麜攦轢囇轣讈攭靂瓥鱱靋瓈嫾奁连怜帘莲連涟梿联裢蓮嗹廉亷漣溓慩覝匲奩熑聨聫磏匳噒鲢劆憐褳聮薕螊濂濓翴縺聯櫣蹥臁謰燫镰鎌蠊簾鬑譧鐮鰱籢籨琏敛脸裣璉蔹槤嬚鄻斂歛臉襝羷蘞蘝练炼恋浰殓堜萰链僆湅媡瑓摙楝煉潋稴練錬澰殮鍊鏈鰊瀲戀纞簗良俍莨凉涼梁椋辌蜋粮粱墚綡樑輬糧冫両两兩俩唡倆掚啢脼裲蜽緉魉魎亮哴谅辆靓量晾喨湸輌煷踉靚輛諒鍄蹽辽疗聊嵺僚膋漻憀寥撩遼敹嘹嶚嶛獠潦憭寮嫽缭璙暸膫燎窷鹩療竂藔賿蹘蟟簝豂廫屪繚镽爎髎飉鷯钌釕鄝蓼爒尥尦炓料尞撂廖瞭蟉镣鐐毟挘咧埓列劣劦劽冽挒茢迾姴峢洌埒烮烈浖捩脟猎猟裂蛚趔聗睙煭颲巤鴷鮤儠擸獵犣爉鬛躐鬣鱲拎厸邻林临啉崊淋惏琳晽粦碄箖鄰粼隣嶙獜遴潾璘霖辚暽斴燐臨磷瞵疄麐翷繗轔蹸壣鏻鳞瀶驎鱗麟菻撛凛凜廪廩澟懔懍檩檁顲吝恡赁悋焛賃亃蔺僯橉閵膦甐藺躏躙轥躪伶刢灵阾夌坽苓岺囹彾狑泠姈玲柃昤瓴朎砱铃秢倰皊鸰凌竛袊陵琌掕聆菱棂蛉崚笭衑舲翎羚淩婈绫紷軨跉詅祾蓤零龄閝鈴裬蔆綾駖輘霊蕶霗鹷錂鴒鲮魿澪霝霛齢燯酃鯪瀮蘦孁齡櫺醽靈欞麢爧龗岭领領嶺另令呤炩溜熘刘沠畄浏留流琉旈畱硫裗蒥蓅嵧馏旒媹骝瑠榴飗駠磂镏鹠劉瘤瑬璢橊疁镠駵癅藰嚠鎦餾麍瀏鎏懰鏐飀騮鐂鰡飅鶹驑珋柳栁桞桺绺锍綹罶鋶熮橮羀嬼六塯遛廇澑磟鹨蹓霤雡鬸飂鷚囖龙茏咙泷珑栊昽胧砻眬竜聋笼隆湰蕯槞嶐漋篭癃龍窿鏧蘢霳嚨巃巄瀧瓏櫳曨朧爖礲矓龒礱襱龓蠬籠聾蠪躘豅靇鑨驡鸗陇垅拢垄儱隴壠攏徿壟竉梇硦衖贚瞜娄婁偻蒌溇楼僂蔞遱嘍廔慺耧樓蝼膢熡耬螻艛髅軁謱鞻髏搂嵝塿摟嶁漊甊篓簍陋屚镂瘘漏瘻瘺鏤喽撸噜氇謢擼嚕卢芦庐垆枦炉泸栌轳胪鸬舮颅舻玈鈩鲈魲盧璷壚攎蘆嚧獹廬瀘瓐櫨臚爐矑蠦罏籚艫纑轤鑪顱髗鸕鱸黸卤虏捛挔掳鹵硵鲁虜塷蓾滷樐魯澛擄橹磠镥瀂櫓艣鏀艪鐪鑥圥甪陆坴侓录彔峍勎辂赂陸菉硉鹿淕渌淥逯娽翏琭椂禄祿輅碌賂睩路稑僇盝剹勠塶摝蔍箓廘粶漉趢樚醁辘踛膔膟觮熝戮蕗穋錴録錄潞璐螰簏鴼騄轆鹭蹗簶鵱麓簵簬鵦鏕鯥騼露鏴籙觻虂鷺氌峦孪娈栾挛鸾脔滦銮鵉圝奱巒孿孌欒曫灓攣羉臠虊圞灤鑾癴鸞癵卵乱釠亂薍掠寽剠稤擽抡掄仑伦囵沦纶轮侖倫陯菕崘崙圇淪惀婨棆腀碖嗧耣蜦綸輪踚磮錀鯩稐论埨溣論啰頱罗萝逻脶猡椤腡锣箩骡镙螺羅鏍覶騾覼儸蘿邏玀欏驘鸁籮鑼饠剆砢倮蓏裸躶瘰蠃臝攞曪癳泺荦峈洛络骆珞洜落笿絡摞雒犖漯鮥鵅濼纙鱳囉驴闾榈馿閭氀藘櫚曥鷜驢吕呂郘侣侶捋梠旅焒祣铝稆屡缕絽鋁膂褛屢履膐褸穞儢縷穭垏律虑哷率绿葎嵂氯滤緑綠慮箻勴繂濾櫖爈卛鑢略畧锊圙鋝鋢妈媽麻嗎痲痳蔴嫲犘蟇蟆马犸玛码蚂馬傌遤獁溤瑪碼螞鎷鷌鰢杩祃閁骂睰榪禡罵駡礣鬕吗嘛埋薶霾买荬買蕒嘪鷶劢迈麦売佅卖脉唛脈麥衇勱嘜賣邁霡霢颟顢姏悗蛮馒慲樠瞒鞔瞞饅鳗鬗鬘鰻矕蠻屘睌満满滿螨蟎鏋曼鄤僈谩墁摱蔄蔓幔獌漫慢嫚缦槾熳澫镘澷縵謾鏝蘰牤邙芒吂汒忙杧尨杗甿盲氓茫厖笀恾哤狵庬浝娏硭铓牻釯朚痝蛖鋩駹蘉莽莾茻壾漭蟒蠎猫貓毛矛茆茅枆牦罞旄軞酕渵堥嵍锚髦緢氂髳蝥錨蟊鶜冇卯夘戼峁泖昴铆笷蓩鉚冃芼皃茂眊冒贸耄覒袤鄚帽貿媢瑁楙毷獏暓愗貌鄮瞀蝐懋霿孭嚒濹嚰癦么庅麽麼沒没玫苺枚栂眉莓脄珻梅脢郿堳葿嵋睂猸湈湄媒瑂楳楣腜煤禖酶槑镅塺鹛霉鋂徾鎇矀攗蘪鶥黴毎每凂美挴浼嵄渼媄媺镁嬍躾燘鎂黣抺沬妹昧袂祙眛跊鬽痗寐媚煝睸魅韎蝞篃嚜椚门扪門钔閅捫菛璊鍆虋闷焖悶暪燜懑懣们們擝虻莔冡掹萌蒙盟溕甍蕄瞢鄸橗鄳儚蝱幪獴濛懞氋檬曚朦鹲礞矇鯍艨矒靀饛顭鼆鸏勐猛瓾锰蜢艋錳懵蠓鯭孟梦夢夣懜霥咪眯冞弥迷祢袮猕谜蒾詸醚謎穈擟糜縻麋麊彌檷禰靡獼麛镾劘攠蘼戂爢醾醿鸍釄米芈羋侎沵洣弭眫脒敉粎葞渳蔝瞇銤濔瀰灖孊糸汨觅泌宓峚祕秘宻覔覓淧密幂谧塓幎覛蔤榓嘧熐漞滵蜜鼏樒冪濗幦藌謐櫁羃簚芇杣眠婂绵棉綿蝒臱緜嬵檰櫋矈矊矏丏汅免沔黾眄俛勉娩勔冕偭渑喕湎愐媔缅腼絻緬鮸靣面麫麪糆麺麵喵苗描媌鹋瞄嫹鶓鱙杪眇秒淼渺缈篎緲藐邈妙庙竗玅庿廟繆吀咩哶灭烕覕搣滅蔑薎鴓幭篾瀎懱櫗闑蠛衊鑖鱴民玟苠旻旼岷怋姄珉盿罠冧捪崏渂琝琘缗瑉碈鈱痻暋緍緡賯錉鴖鍲皿冺闵刡垊抿呡泯勄闽敃悯笽笢敏閔湣黽敯愍閩慜僶潣憫簢鳘蠠鰵名明鸣茗眀洺冥眳朙铭鄍蓂猽溟嫇榠暝鳴銘瞑螟覭佲姳凕酩慏命掵詺谬缪謬摸嚤尛谟馍嫫摹模膜魹摩橅磨糢謩謨嬤擵饃蘑嚩髍魔饝抹麿懡末圽劰茉歾歿殁冐帓沫怽陌妺枺昩帞莫莈砞眜眿秣皌眽粖袹絈蛨貃塻蓦嗼貊貉漠寞靺暯銆瞙瞐黙墨镆魩瘼嫼默縸貘藦蟔鏌爅驀礳纆耱嬷哞牟侔劺洠恈桙眸谋蛑踎鉾謀麰瞴鴾鍪蟱某呒呣毪氁嘸母牡亩坶拇姆峔牳胟畒畆畞砪畝娒畮鉧踇木目仫凩狇沐苜牧炑莯蚞钼毣募萺雮墓幕睦幙鉬慔楘慕暮樢霂艒穆鞪乸拏拿蒘镎鎿郍哪雫那吶呐妠纳肭钠衲娜袦納捺軜笝豽鈉貀靹蒳嗱魶腉熋摨螚孻乃艿奶氖疓廼迺倷釢嬭奈柰耐萘渿鼐褦錼囡男抩枏南侽莮畘娚难萳遖喃楠暔諵難赧揇湳腩煵蝻戁婻囔乪嚢譨囊鬞蠰馕欜饢擃曩攮灢儾齉孬呶怓挠峱硇铙蛲猱詉撓嶩獶夒鐃巎獿垴恼脑悩脳匘堖惱瑙腦嫐碯闹淖閙鬧讷抐眲訥呢馁腇餒鮾鯘內内氝嫩嫰能銰妮尼坭抳泥怩籾铌秜屔郳倪蚭猊淣埿婗棿跜鈮蜺輗貎觬霓鲵鯢麑齯臡拟伱你苨狔妳柅掜旎晲鉨孴馜儞隬擬薿鑈氼屰伲迡昵胒逆匿眤痆堄惄睨腻溺愵嫟暱誽縌膩懝嬺拈蔫年秊哖姩秥鲇鲶鮎鵇黏鯰捻淰辇焾輦撵撚碾簐攆躎卄廿念埝唸艌娘嬢酿醸釀鸟茑袅鳥裊嫋蔦褭嬝嬲尿脲捏揑苶乜肀帇圼枿陧聂臬涅菍啮惗隉敜湼嗫嵲鉩踂槷踙踗噛镊镍颞嶭篞臲錜蹑聶嚙鎳孽孼蘖籋櫱齧囁糵巕蠥糱囓躡讘鑷顳钀脌囜恁您拰宁咛狞柠聍寕甯寍寜寧儜凝薴嚀獰嬣檸聹鑏鬡鸋拧橣擰矃佞侫泞倿寗澝濘妞牛牜汼扭狃沑忸纽杻炄钮莥紐鈕靵拗农侬哝浓脓秾農辳儂蕽噥濃憹檂膿燶禯穠癑襛醲欁繷弄挊挵齈羺啂槈耨檽鎒鐞譳奴伖孥驽砮笯駑伮努弩胬怒傉搙奻渜暖煗餪疟虐硸瘧黁挪梛傩橠儺诺掿逽喏堧搦锘榒稬搻蹃諾鍩糑嶿懦懧糥穤糯女钕籹釹衂恧衄朒噢哦讴沤瓯欧殴鸥筽塸蓲漚甌歐毆鴎膒熰藲櫙謳鏂鷗齵呕吘偶腢嘔耦蕅藕怄慪帊妑趴皅舥啪葩杷爬钯耙跁琶掱鈀筢潖帕怕袙拍俳排徘猅棑牌箄輫簰簲犤哌派渒蒎湃鎃眅萠畨潘攀爿盘蒰幋媻槃搫磐盤螌褩縏蹒蹣蟠鎜瀊鞶冸判沜炍泮柈盼牉叛畔袢詊溿頖鋬鵥襻鑻乓沗胮雱滂膖霶厐彷庞逄旁徬嫎膀螃篣龎鳑髈龐鰟嗙耪覫胖抛拋萢脬刨垉咆狍庖爮炰袍匏蚫軳鞄褜麅跑奅泡炮砲疱皰麭嚗礟礮呸肧怌柸胚衃醅阫陪培婄赔毰锫裴賠錇俖伂沛帔佩昢斾姵珮配旆浿淠蓜辔馷霈嶏轡喷噴濆瓫盆葐湓呠翸歕匉抨怦恲砰梈烹弸軯閛漰駍嘭磞芃朋竼莑倗堋淜彭棚椖塳搒塜蓬硼稝鹏樥槰熢輣澎憉篷錋膨韸髼鬅蟚蟛蘕鵬韼纄鬔騯鑝捧皏淎剻掽椪碰踫丕伓批邳伾纰坯抷披狉狓炋怶砒秠秛紕耚旇翍豾鉟鲏銔髬駓磇劈螕噼錍魾錃憵礔礕霹皮阰芘枇毞岯肶毗毘蚍铍笓郫疲陴埤蚽蚾啤崥豼猈琵椑腗脾焷鈹蜱罴膍隦鮍篺貔螷羆鼙朇蠯匹庀圮仳苉脴痞銢鴄諀擗噽癖嚭屁揊睤睥辟媲嫓潎僻壀澼甓疈譬闢鷿囨偏媥犏甂篇翩鍂骈胼腁楩楄賆骿諚駢蹁騈覑谝貵諞片骗魸騙騗剽彯漂缥飘翲螵旚縹犥飄魒飃嫖瓢薸闝殍瞟篻醥顠皫票勡僄嘌徱慓氕暼瞥丿苤撇撆鐅嫳拚拼姘礗穦馪驞玭贫娦貧琕频嫔頻薲嬪矉嚬蠙颦顰品榀朩牝汖聘乒甹俜砯涄娉聠艵頩冖平评坪苹呯岼凭郱泙玶荓枰帡胓洴屏瓶萍硑蚲帲屛塀蓱蛢幈缾甁評焩軿鲆凴竮輧箳慿鮃憑檘簈鵧蘋攴钋坡岥泼釙颇酦溌潑醱鏺婆蔢嘙鄱謈皤櫇叵尀钷笸鉕駊廹岶迫珀敀洦砶破哱烞粕奤蒪魄頗剖頮抔抙捊掊裒箁咅犃扑炇巬陠铺痡撲噗鋪擈鯆仆圤匍莆菩脯葡菐蒱蒲蜅酺僕墣獛璞瞨镤穙濮贌鏷纀朴埔圃浦烳普圑溥暜谱諩潽樸氆檏镨蹼譜鐠舖舗瀑曝七迉沏妻柒恓栖桤郪缼凄捿萋桼戚淒悽娸朞期欺棲紪傶褄榿嘁僛漆慽緀慼諆霋諿蹊魌鵸鶈鏚亓齐祁圻芪岐岓庈忯其奇歧肵斉祈祇亝荎荠疧竒耆剘蚑蚚蚔倛颀脐斊旂掑埼萁軝畦跂帺崎釮猉淇骐骑琪琦棊棋蛴嵜祺碁碕锜鬾鬿頎愭褀蜝綦蜞齊旗粸綨綥緕璂蕲踑禥螧鲯藄鮨濝懠騏騎櫀檱簱臍鳍蘄鶀鯕麒鬐蠐籏艩纃騹魕鰭玂麡乞邔芑屺岂企玘杞盀呇启起唘豈啔啟啓婍绮棨晵裿綮綺諬簯闙气讫気迄汔芞矵弃汽炁盵泣契砌咠栔氣訖唭欫葺夡棄湆湇愒碛碶暣甈槭噐憇磧磩磜器憩薺蟿罊礘鼜掐葜愘搳拤峠酠跒鞐圶冾帢洽恰硈殎髂千仟阡圲扦芊迁圱汘奷茾杄岍佥汧臤钎欦竏拪牵粁蚈铅谸悭孯婜釺牽雃掔鈆谦签愆鉛僉鹐摼撁箞慳搴鳽遷諐褰謙顅檶攑攐櫏簽鵮攓鐱鶼鬝鬜籤韆瓩岒拑钤前歬虔钱钳掮乾軡偂朁鈐媊鉗鉆墘榩箝銭蕁羬潜潛橬黔錢黚騝騚濳籖鰬灊凵肷浅淺遣嵰槏蜸谴缱繾譴鑓欠刋芡茜倩悓堑棈椠嵌蒨皘慊蔳塹歉輤槧篏儙篟壍嬱縴鏲鰜羌玱枪戗戕斨羗猐琷啌椌嗴腔獇溬蜣锖瑲槍嶈锵戧羫牄篬錆謒蹡鎗鏘強强墙蔷嫱蔃樯漒墻薔廧嬙檣牆艢蘠抢羟搶羥摤勥墏镪襁繈繦鏹呛炝唴跄嗆熗蹌羻悄硗郻跷鄥踍锹劁敲毃墝頝橇幧燆缲橾磽鍫鍬繑趬蹺蹻乔侨荞荍峤桥硚喬鄡槗僑谯墧鞒蕎嘺嶠憔嫶橋樵犞礄瞧癄趫藮譙鐈鞽顦巧釥愀髜俏诮陗峭帩窍殼翘踃誚髚撬僺墽撽鞘韒翹鞩竅躈切苆癿茄聺且厒郄妾怯匧窃洯挈倢悏笡淁惬蛪趄愜朅锲箧魥緁踥篋藒穕鍥鯜鐑籡竊钦侵亲衾骎菳嵚媇綅誛嶔駸顉鮼寴扲芹芩忴秦珡埁耹菦蚙捦琹琴鈙鈫禽雂勤靲嗪溱嫀擒斳噙鳹檎螓瘽澿懄懃蠄鵭坅昑笉赾赺梫锓寑寝寢鋟螼抋吣沁吢唚菣揿搇撳藽瀙青靑轻氢郬倾卿埥圊氫庼清淸寈軽傾輕蜻綪漀鲭鶄鯖鑋夝甠勍啨情棾晴氰暒樈檠擎黥苘顷请頃廎請謦檾庆凊掅殸碃靘箐慶磬親罄儬濪櫦卭邛宆穷茕穹桏赹笻筇琼蛩蛬焭焪惸跫睘煢熍銎窮橩儝憌藑瓊藭竆瓗丘丠邱坵秋秌恘蚯萩媝湫楸鹙蝵篍緧趥穐鳅鞦鞧蟗蘒鶖鰍鰌龝厹玌扏囚叴犰朹肍汓求虬虯泅俅釓觓訄訅酋莍逑逎唒釚浗紌球梂殏赇毬釻盚皳崷遒湭渞巯裘蛷煪絿巰賕觩璆蝤銶鼽鮂鯄蠤鰽搝糗区匤岖佉伹诎阹驱抾岴屈胠浀祛袪區蛆躯紶趋蛐筁詘粬駆嶇憈麹駈敺誳髷魼趨麯軀麴黢驅鰸鱋佢劬朐斪胊菃衐鸲渠淭翑絇葋軥蕖璖磲螶鴝璩蟝翵瞿鼩蘧匷忂灈欋戵氍籧臞癯蠷衢躣蠼鑺鸜曲取娶詓竬蝺龋齲去厺刞迲呿郥耝阒趣觑閴麮闃鼁覷覰覻奍峑恮悛圈棬圏駩騡鐉权全佺诠荃泉洤姾辁牷拳埢硂啳铨痊惓婘葲犈筌腃湶絟瑔搼楾輇跧詮觠蜷銓権踡醛縓闎鳈鬈巏鰁孉權齤颧蠸顴犬汱甽畎烇绻綣虇劝券牶椦勧韏勸炔缺蒛闕瘸却卻埆崅隺悫雀硞确舃阕塙搉鹊皵碏阙愨榷趞慤碻確闋燩礐鵲礭夋囷峮逡輑帬裙裠羣群冄呥肰柟衻袇蚦袡蚺舑然髥髯嘫燃繎冉苒姌珃染蒅媣橪蹨穣獽瀼孃禳穰瓤躟鬤壌壤攘嚷爙让譲懹讓荛饶娆桡嬈橈襓饒犪扰隢擾绕遶蟯繞惹热熱人壬仁忈朲芢秂忎鈓魜銋鵀忍荏荵栣栠涊秹棯稔綛躵刃刄认仞仭讱扨屻任纫韧杒轫牣肕饪妊纴祍衽姙紉軔訒紝梕釰袵靭靱飪腍韌絍餁認扔仍辸礽陾芿日驲鈤馹戎肜茙茸荣狨栄绒峵毧容烿搑嵘傛羢媶絨搈蓉榵嵤溶嫆瑢榕穁榮熔蝾镕褣縙髶駥融螎嶸嬫鎔爃瀜曧蠑冗宂坈傇氄穃禸柔粈揉葇渘媃瑈腬煣蝚糅輮蹂鍒鞣瓇騥鰇鶔韖肉宍楺邚如侞茹帤桇挐铷袽筎渪銣蕠儒鴑薷嚅獳濡孺嬬鴽曘臑燸襦颥蠕繻醹顬鱬汝肗乳辱鄏擩入扖杁洳蓐嗕鳰溽媷缛褥縟撋壖阮软朊耎軟偄愞媆瑌腝碝蝡緛輭瓀礝甤緌蕤桵惢蕋蕊橤繠蘃蘂芮汭枘蚋锐瑞蜹睿銳鋭叡壡闰润閏閠潤橍叒若鄀偌弱焫渃婼楉蒻嵶箬篛爇鰙鰯鶸仨洒訯靸撒潵灑卅钑飒脎萨馺摋隡颯薩櫒毢揌毸腮塞嘥噻鳃顋鰓嗮赛僿賽簺三彡氵弎叁毶毵厁犙毿鬖伞傘糁馓糂橵糝糤糣繖鏒鏾饊俕散閐桒桑喪槡搡嗓磉褬颡鎟顙丧掻搔溞慅骚缫鄵螦懆鳋繅騒颾騷鰠鱢扫掃嫂埽瘙氉臊矂鐰髞色洓栜涩啬雭铯渋歮瑟嗇銫歰澁擌穑瘷濏濇懎璱澀穡瀒繬轖穯鏼譅飋涁森椮槮襂篸僧鬙杀沙纱乷砂剎挱莎唦殺猀粆紗铩桬痧硰蔱裟榝樧魦鲨閷鎩鯋鯊繺啥傻儍倽萐唼帹厦喢歃煞廈翜箑翣閯霎筛酾篩簁釃晒曬山邖圸芟杉刪删苫钐衫姍姗珊埏舢狦軕脠痁閊笘釤跚搧剼嘇煽潸澘穇檆膻鯅縿羴羶鱣闪陕炶陝閃晱睒煔熌覢讪汕疝赸訕扇椫傓善銏骟僐鄯墠墡缮擅樿膳敾嬗磰赡謆蟮繕蟺騸贍鐥饍鳝譱灗鱓鱔伤殇商觞傷墒蔏漡滳慯殤熵螪觴謪鬺垧晌埫赏賞贘鑜丄上尙尚恦绱緔裳捎莦烧弰娋梢稍焼蛸筲艄旓輎蕱颵燒髾鮹勺芍杓玿萔韶少卲邵劭绍柖哨袑紹睄綤潲奢赊猞畲輋賒賖檨舌佘蛇蛥舍捨厍设社舎厙射涉赦設渉涻弽摂摄滠慑摵蔎慴騇蠂韘攝麝灄懾欇申扟屾伸身呻侁籶诜罙妽绅珅柛氠籸穼莘砷眒峷甡娠堔敒深紳葠兟訷裑蓡罧詵蔘幓甧駪薓鲹燊曑鵢鯓鯵鰺什神榊鉮鰰伔邥抌沈弞审矤哂矧宷谂谉訠渖婶頣魫諗審曋瞫瀋嬸讅覾肾甚昚侺胂眘脤渗祳葚腎椹蜃瘆慎愼滲鋠瘮升生阩声呏斘苼枡昇狌泩珄殅牲竔陞曻陹笙甥焺湦鉎聲鍟鼪鵿绳縄澠憴繩譝鱦省眚偗渻圣胜晟晠盛剰貹剩勝聖琞嵊墭榺蕂橳賸尸失师邿呞诗鸤虱狮施浉屍師敆絁葹湿湤蓍蒒鉇獅詩溼溮瑡鳲鳾箷蝨鲺褷鍦濕鯴鶳鰤襹籭十丆饣辻石瓧时佦竍识囸飠実实旹拾峕食蚀炻祏姼埘莳時遈湜寔塒蒔嵵鉐溡榯鉽蝕實篒鲥鮖鼫鼭識鰣史矢乨豕使始驶兘宩屎笶榁鉂駛士氏礻示世丗仕市式卋似亊势柹事呩侍饰试视拭贳枾柿昰是眂适狧恃恀室冟逝栻轼眎眡铈舐烒秲笹釈視揓貰崼徥弑释谥觢勢軾睗嗜筮鉃鈰弒飾試煶誓舓適奭銴餝噬遾諟諡澨嬕螫檡謚簭籂齛釋鰘襫匙収收敊手守垨首艏寿受狩授售兽涭绶痩膄夀壽瘦綬獣獸鏉殳书疋尗抒纾枢杸叔陎柕姝殊倏倐書紓掓菽梳軗焂鄃淑舒疎疏摅输毺毹綀踈跾蔬樞輸鮛攄鵨瀭秫孰婌赎塾熟璹贖鼡暑黍属署蜀鼠潻薯薥曙癙襡糬籔屬蠴鱪鸀鱰丨忄术朮戍束述沭荗树怷竖捒恕蒁術庻庶絉尌裋竪鉥腧数墅潄漱豎數澍樹錰濖鶐鏣虪刷唰耍誜衰缞摔縗甩帅帥蟀闩拴閂栓涮腨双滝霜雙孀骦騻孇欆礵鷞鹴艭驦鸘爽塽漺慡樉縔鏯灀谁脽誰水氺閖挩捝帨涗涚祱稅税裞睡吮顺順舜蕣橓瞚瞤瞬鬊说哾說説妁烁铄朔硕矟搠蒴碩槊獡鎙爍鑠厶司丝私咝泀思俬恖虒鸶斯蛳愢媤缌絲楒鉰飔禗榹厮罳锶銯凘禠撕蕬磃嘶噝廝澌緦螄燍鍶蟴蟖簛颸騦鐁鼶鷥死偲巳亖罒四寺汜兕佀伺泤祀姒価饲泗孠驷柶枱牭俟娰肂飤洍涘耜梩笥釲竢覗肆嗣鈻貄飼駟禩蕼騃儩瀃忪松枩枀柗娀倯凇菘崧庺淞梥愡硹嵩蜙濍憽檧鬆怂耸悚竦傱愯嵷慫駷聳讼宋送诵颂訟頌誦鎹餸凁捜鄋搜蒐嗖獀馊廋廀溲摉飕摗锼螋艘醙鎪餿颼騪叟叜傁蓃瞍嗾擞薮謏擻藪櫢欶嗽瘶苏甦酥稣窣穌鯂蘓蘇櫯囌俗玊夙诉泝肃洬珟素速涑梀殐粛骕粟傃訴谡塐嗉塑遡溸溯愫肅鹔嫊趚蔌榡遬僳膆觫愬樕樎鋉餗潥憟潚縤璛藗橚簌謖蹜驌鱐鷫狻痠酸匴祘笇蒜筭算夊芕虽挼荽荾哸倠浽娞眭睢滖熣鞖濉雖绥隋随遀綏隨瓍膸瀡髄髓亗岁砕粋谇祟埣嵗脺遂碎歲歳睟煫隧賥穂誶澻嬘璲檖燧禭穗穟邃襚繀旞懳繐繸譢鐆鐩孙荪狲孫飧搎蓀猻槂蕵薞损笋隼筍損榫箰鎨鶽摌潠莏唆娑桫梭傞挲睃蓑嗦嗍羧趖摍缩簑髿簔縮鮻所索唢琑琐锁暛嗩溑瑣鎍鎖鎻鏁逤溹蜶他它她牠祂咜趿铊塌榙遢溻褟闧蹹塔墖獭鳎獺鰨沓挞荅闼崉涾傝搨遝阘榻毾禢撻踏誻澾橽嚃錔鞜蹋濌鞳闒鎉闥嚺譶躢咍囼孡珆胎台旲邰坮抬苔骀炲炱菭跆鲐臺箈颱駘儓鮐擡薹嬯檯籉呔太夳冭忕汰忲态肽钛泰舦粏酞鈦溙態燤軚坍贪怹貪痑摊滩嘽瘫潬擹攤灘癱坛昙倓郯谈埮惔婒覃弾榃锬痰谭墰墵醈談潭憛壇橝曇檀镡顃藫罈壜醰貚譚譠罎忐坦钽袒菼毯鉭嗿憳醓暺憻璮襢叹炭探赕湠僋碳嘆舕撢歎賧汤铴湯耥嘡劏蝪羰薚蹚闛鞺鼞饧坣唐堂棠啺傏鄌塘搪蓎嵣溏隚瑭榶膅煻漟禟樘磄膛糃橖踼螗镗篖糖赯醣螳餳糛鎕餹鏜饄鶶帑倘偒淌傥镋躺鎲儻戃曭爣矘钂烫摥趟燙鐋仐弢涛绦焘掏絛詜搯幍滔慆嫍瑫韬槄飸縧縚謟濤燾鞱韜饕匋迯咷逃洮桃陶萄梼啕淘绹祹裪鞀蜪綯鞉醄駣鋾騊檮饀鼗讨討套忑忒貣特脦铽慝鋱蟘膯鼟疼幐腾誊漛滕邆螣縢駦謄藤儯騰籐鰧籘虅驣霯剔梯锑踢銻鷈鷉扌苐厗绨偍提啼罤崹稊遆鹈渧惿媞缇瑅嗁綈碮褆蕛题蝭徲漽緹趧醍蹄鴺蹏鍗鳀謕題鮷鵜騠鶗鯷鶙鷤体躰骵軆體戻屉剃洟挮倜逖涕悌掦逷悐惕屜替惖裼褅髰殢歒鬀嚏瓋鬄嚔籊趯天兲添婖靔酟黇靝田沺屇盷畋胋畑恬畠甛菾甜湉填搷塡阗碵緂磌窴鴫璳闐鷏鷆忝殄倎捵唺铦淟悿琠晪觍腆睓痶舔餂賟覥靦錪掭瑱睼舚旫佻挑庣恌祧聎芀条苕岧岹迢祒條调笤蓚蓧蓨龆樤蜩髫鋚鞗鲦螩鯈鎥儵齠鰷宨晀窕誂窱嬥朓脁眺粜絩趒跳覜頫糶帖怗贴萜聑貼跕铁蛈鉄僣鐡鐵驖呫飻餮厅艼庁汀厑听耓厛烃烴渟綎鞓聴聼廰聽廳邒廷莛亭庭停葶蜓嵉筳婷楟榳霆閮聤蝏諪鼮圢侹挺涏娗珽梃脡烶颋艇誔頲濎囲炵通痌蓪嗵樋熥冂仝同佟彤峂庝茼哃狪桐砼晍蚒烔浵眮铜秱衕童粡絧赨酮鉖詷僮鉵銅餇鲖勭獞潼橦曈犝朣膧氃燑瞳穜鮦统捅桶筒統筩綂恸痛慟憅偷偸鍮头投骰緰頭妵紏殕鈄敨斢黈蘣哣透凸禿秃突唋涋捸堗葖痜湥瑹嶀鋵鵚鼵図图凃捈荼徒峹途庩涂梌屠揬稌蒤筡嵞鈯腯瘏塗酴跿圖圗廜潳馟駼鍎鵌鶟鷋鷵土圡吐汢钍釷兎迌兔莵堍菟鵵猯湍圕煓貒团団抟摶蓴團漙慱槫篿檲鏄糰鷒鷻疃彖湪褖推蓷藬颓僓隤尵頹頽頺魋蘈蹪穨俀脮腿蹆骽侻退娧蛻蜕煺褪螁駾吞呑旽涒朜焞暾黗屯芚囤饨庉忳軘豘豚飩鲀魨霕臀臋氽畽坉乇讬托饦汑杔拖拕咃侂沰莌託袥飥脫脱馲魠驝驮佗陁陀坨岮狏沲沱迱驼柁砤砣鸵袉紽堶酡跎詑馱碢鉈駄槖駞駝踻鋖橐鴕鮀鼧騨鼍驒鼉妥毤庹椭楕撱橢鵎軃鰖拓柝唾涶毻箨籜屲穵劸挖哇徍洼畖窊娲啘媧蛙搲溛漥窪鼃攨娃譁瓦邷佤咓瓲砙袜聉嗢腽膃襪韈韤咼歪喎竵崴外顡弯剜捥帵塆湾睕蜿箢豌潫彎壪灣丸刓芄汍纨抏岏完玩笂紈顽捖貦烷骫頑宛挽莬唍倇盌琓埦菀梚晚晥脘涴惋婉绾琬葂椀晩晼皖碗畹輓綰綩踠鋔万卐卍杤忨脕萬腕鋄翫瞣蟃贃鎫贎尪尫汪尩亾兦亡王仼彺莣蚟网忹枉罖罔徃往菵惘棢辋暀蛧蝄網輞誷魍瀇妄迋忘旺盳望朢危威烓逶偎隇隈揻揋葳葨喴渨愄媙楲椳微詴煨溦蝛覣縅薇嶶鳂燰癐巍鰄鰃囗韦为圩违围帏闱沩峗峞為洈韋桅涠唯帷惟维琟喡嵬幃圍爲溈湋違媁蓶鄬潍維撝醀潿潙寪闈鍏鮠濰癓覹霺犩伟伪苇芛尾纬玮委炜洧捤荱浘诿屗娓萎梶硊崣骩偽偉隗蒍葦嵔骪徫猥廆愇瑋椲韪暐艉腲痿煒蜲蜼僞鲔蔿韑踓頠諉緯薳儰鍡鮪濻壝韙颹瀢韡亹斖卫未位苿味畏胃軎叞菋硙谓尉喂猬渭媦煟墛蔚碨熭磑蝟衛犚慰緭璏罻衞錗餧鮇謂濊懀魏餵螱褽藯轊霨鏏鳚蘶饖躗讆躛讏昷塭温瑥榅殟溫榲瘟豱鎾饂鳁鰛鰮亠文芠彣纹炆砇闻蚊蚉紋珳阌雯駇馼聞瘒魰鳼鴍閺閿螡闅鼤蟁闦刎抆呚吻呅忟肳忞紊桽脗稳穏穩问汶妏問揾搵顐璺翁嗡滃鹟螉鎓鶲奣勜塕蓊嵡暡瞈聬攚瓮蕹甕罋齆挝莴倭涡堝捼萵唩猧渦涹喔窝蜗窩撾蝸踒我捰婐婑仴肟沃卧臥捾偓握硪幄焥渥媉楃腛斡瞃瓁龌臒濣齷乌圬邬污弙杇巫呜钨洿诬屋趶烏釫窏剭鄔嗚誈歍誣箼螐鴮鎢鰞无毋芜吾吴吳呉郚莁茣唔浯洖娪珸梧祦鹀無蜈禑墲蕪璑橆鵐鯃譕鼯鷡乄五午伍仵迕庑怃忤妩武玝旿俉侮捂倵啎牾娬珷鹉摀碔瑦舞熓廡潕憮嫵甒儛錻鵡躌兀勿戊务阢扤屼伆坞芴杌岉忢矹物误敄逜粅悟悮悞務晤焐靰痦隖婺骛塢雾雺嵨溩奦誤寤鹜熃鋈窹霚鼿霧齀騖鶩夕兮邜覀西吸汐忚扸希昔析矽卥肸肹穸怸俙徔徆郗饻莃唏氥牺息奚狶浠悕屖娭琋赥菥桸硒唽晞焁釸欷悉烯淅渓惜焈晳惁晰睎稀傒鄎舾翕翖粞焟焬犀蒠皙厀嵠锡徯溪煕熙蜤榽豨蜥熈僖餏誒熄緆磎嘻噏餙膝瘜嬉嬆熹橀樨螅螇錫歙凞羲熺熻窸礂豯瞦蟋犠豀貕谿燨鵗鯑糦雟繥醯鏭觹譆隵曦巇酅犧爔觽鼷蠵鸂觿鑴习郋席觋袭習喺蒵蓆椺媳趘覡嶍漝槢蝷薂隰檄鎴謵霫鳛騱飁騽鰼襲驨杫洗枲玺铣徙喜葸葈鈢蓰銑漇屣憘歖憙橲暿諰禧壐謑縰蹝蟢璽瓕鱚囍躧匸卌戏饩系呬忥怬细盻咥係郤恄欯绤釳鈒阋細趇椞舄隙赩滊慀禊隟綌犔稧熂蕮戯覤澙潟潝戱黖繋磶戲鬩虩餼闟嚱霼衋虾谺閕傄敮颬煆瞎蝦鰕匣侠郃狎柙峡俠狭炠陜珨峽狹烚祫硖翈笚舺陿硤遐瑕暇筪舝碬辖睱蕸磍赮螛魻縖轄霞鍜黠鎋騢鶷閜丅下圷芐吓疜夏梺嚇罅懗鎼夓鏬仙仚屳先奾纤氙佡忺苮杴秈祆籼姺珗莶掀搟酰跹锨嘕僊僲銛鲜韯暹薟鍁錟憸嬐韱鮮褼繊蹮馦攕譣廯孅鶱纎躚襳纖鱻咞伭闲贤弦挦咸胘涎娴蚿衔舷婱娹絃閑閒蛝啣痫鹇湺嗛衘嫌銜甉撏賢誸澖憪嫻嫺輱醎諴瞷癎癇藖礥贒鷴鷼鷳狝冼显险蚬崄毨猃烍険赻筅尠尟跣蜆禒箲險嶮獫藓獮鍌燹顕攇幰蘚櫶玁韅顯灦伣苋县岘现臽限线県俔宪陥姭垷莧哯峴涀陷娨娊現晛馅睍羡缐絤献腺羨粯僴僩膁誢綫撊鋧線縣錎餡憲豏麲臔瀗霰獻糮鼸乡芗相香郷厢鄊鄉葙廂湘缃鄕楿薌箱膷緗襄儴勷蘘忀麘骧瓖欀镶鱜纕鑲驤瓨佭详庠栙祥翔絴跭詳享响饷亯蚃晑飨想銄餉鲞鮝蠁鯗饗響饟鱶向项巷姠珦象項萫缿稥像勨嶑潒橡曏襐蟓嚮鐌鱌灲灱肖枭枵哓侾骁逍鸮恷虓庨消宯宵绡萧梟猇焇婋萷硣硝销翛痚痟窙揱綃嘐箫歊潇撨霄嘵箾銷獢蕭鴞魈膮彇藃蟏蟂穘簘鴵謞鵁嚣蟰髇簫譊瀟櫹嚻囂髐鷍驍蠨毊虈洨郩崤訤淆誵小晓暁筱筿皛曉篠皢孝効咲校哮笑俲效涍啸傚敩詨嘋嘨誟嘯熽歗斅斆些楔歇蝎蠍协邪旪協胁奊垥拹峫恊挾脇衺脅脋偕斜谐揳翓猲瑎携嗋愶綊膎熁撷頡擕鞋蝢緳勰缬諧燲擷鞵襭攜纈讗龤写冩寫藛伳灺屃缷泄泻祄绁卸炧炨洩娎卨屑屓焎械禼偰徢紲亵渫谢屟媟絬塮僁榭榍褉暬碿噧屧緤薤薢韰嶰獬邂廨糏澥懈謝燮褻鞢夑瀉齘蠏蟹爕瀣齥齂躠躞屭心邤芯辛忻妡杺昕欣盺俽訢惞锌鈊新歆鋅廞薪噺噷嬜馨鑫馫枔鬵鐔伈阠伩囟孞炘信軐衅脪訫焮馸顖舋釁星垶骍猩惺瑆蛵腥煋觪箵篂鮏謃騂曐觲皨嬹鯹刑邢形坙郉侀型哘钘洐娙硎铏裄鈃銒鉶鋞睲醒擤兴杏幸性姓荇莕倖涬悻婞塂緈興臖凶匂兄芎兇匈讻汹忷哅洶恟胸胷訩詾雄熊诇詗夐敻休俢茠咻修庥烋脩羞烌鸺脙臹貅馐髤樇銝髹鵂鎀鮴鏅饈鱃飍苬朽宿滫潃綇糔秀岫峀珛袖绣琇锈嗅溴綉璓褏褎裦銹螑嚊繍鏥繡鏽齅戌吁旴盱疞姁须欨胥顼訏虚虗偦裇谞揟虛幁須媭頊楈窢墟需嘘稰魆蕦歔蝑噓嬃縃諝歘譃魖驉鬚鑐俆徐蒣许呴诩珝栩冔蛡暊詡鄦糈醑盨旭伵序汿沀侐卹昫叙洫恤珬垿殈欰烅酗勖勗敍敘烼绪续聓壻朂喣訹溆湑絮婿蓄賉煦慉続槒瞁盢聟銊潊漵緒稸獝緖瞲藚續鱮蓿吅轩昍咺宣軒晅谖塇揎萲萱喧愋愃媗瑄蓒暄煖煊睻蝖箮儇翧禤蕿諼諠嬛駽轋鍹蘐藼矎蠉翾鰚譞讂玄妶玹痃琁悬旋蜁漩嫙璇暶檈璿懸选烜暅選癣癬泫怰昡炫绚眩铉袨琄眴衒渲絢楦鉉蔙碹镟颴縼繏鏇鐶贙削疶蒆靴薛辥辪鞾穴斈乴茓岤峃学泶鸴袕踅噱嶨學鴬澩燢觷雤鷽雪樰膤艝轌鳕鱈血坹狘泧怴桖谑謔瀥坃勋姰埙焄勛塤蔒熏窨勲駨薫勳壎薰嚑獯曛臐燻蘍矄壦爋纁醺廵旬寻巡杊畃郇询荀荨咰峋洵浔恂紃珣栒桪毥偱揗循尋詢鲟鄩噚潯璕燅樳攳燂燖襑蟳鱏鱘灥卂训讯伨汛迅驯侚徇迿狥巺逊殉訓訙訊奞殾稄巽馴遜賐愻蕈噀濬顨鑂丫压押庘鸦桠鸭铔孲椏鴉鴨壓鵶鐚牙伢芽岈玡枒厓疨琊蚜笌堐崕崖猚涯瑘睚衙漄齖厊庌哑唖啞痖雅瘂蕥劜圠亚襾讶亜迓犽亞軋垭挜砑娅氩俹埡掗訝婭揠聐氬猰圔稏窫錏齾呀咽恹珚剦胭烟焉菸崦偣阉焑淹腌湮鄢傿煙樮漹嫣醃嶖閹篶懨臙黫讠厃延闫严言訁妍昖岩郔炎沿挻莚研唌狿姸娫盐娮琂硏閆啱訮阎蜒喦嵒嵓筵綖塩楌揅詽蔅碞颜虤閻厳檐顏顔壛嚴巌簷櫩麙壧巖巗欕鹽麣夵抁沇奄兖乵匽俨衍弇兗剡掩菴萒郾厣眼偃酓琰揜棪嵃遃渰渷愝扊隒椼硽罨裺演褗魇蝘戭噞躽縯黡檿厴鶠齞甗黤鰋龑黬黭儼鼴顩孍魘曮巘巚鼹礹齴黶厌妟觃牪砚彥彦姲艳覎晏唁烻宴验掞豜偐焔谚隁堰葕硯雁猒喭焰敥焱椻鳫滟墕酽厭暥熖嬊餍鴈谳燕赝鬳燄諺嬮曕鴳験騐酀懕贋嚥艶軅嬿騴醶爓鷃贗灔驗鷰醼饜觾讌艷驠釅灎豓讞灧豔灩央抰咉泱姎殃胦眏鸯秧雵鉠鞅鴦扬羊阳阦玚杨旸飏炀钖氜佯疡劷垟昜徉羏洋珜眻陽揚蛘崸崵瑒楊敭暘蝆煬禓瘍輰諹鍚鴹颺鐊鰑霷鸉卬仰佒坱岟养炴氧痒紻楧軮傟氱羪慃養駚攁瀁懩礢癢怏柍样恙烊羕詇様漾樣幺夭吆妖枖殀祅訞葽喓楆腰鴁邀爻尧尭侥肴垚轺峣姚珧倄烑窑堯揺軺傜殽谣摇搖嗂徭遥猺遙滧愮媱瑶瑤摿榣暚銚飖餆蕘磘嶢嶤徺窰窯餚繇謡謠鎐鳐颻蘨顤鰩仸岆宎抭苭杳狕柼咬眑舀窅窈偠崾婹蓔溔榚鴢闄騕齩鷕药要钥穾袎窔葯筄鈅詏靿覞熎鹞獟薬鼼藥曜艞燿矅耀曣鷂纅讑鑰耶倻掖椰暍噎潱蠮爷捓揶铘釾爺鋣鎁擨也吔冶虵埜野嘢漜壄业叶页曳邺曵抴夜枼頁亱洂捙枽晔烨偞液谒堨葉殗鄓腋墷楪業馌璍曄曅僷歋燁擛擖靥鄴瞱皣嶪嶫餣謁澲擫瞸曗嚈鍱擪礏鎑饁爗鵺鐷驜靨鸈一弌辷衤伊衣壱医吚依祎咿洢畩铱猗渏郼揖壹欹蛜禕嫛稦銥漪褘嬄夁瑿鹥噫繄檹毉醫黟譩黳乁匜仪圯夷彵杝沂宐戺冝诒侇狋饴沶怡宜衪荑柂咦峓贻迻恞姨瓵巸桋栘眙胰宧扅袘弬萓移釶痍椬貽遗蛦詒羠颐媐椸頉暆跠飴誃銕疑遺儀熪頤頥螔嶬彛彜嶷簃顊鮧寲謻彞彝鏔籎觺讉鸃乙已以扡钇迆苡佁攺矣苢迤蚁舣釔庡笖倚扆逘偯椅崺鳦鈘鉯旑旖輢敼螘錡檥礒蟻顗艤轙齮靉乂弋亿义艺刈忆仡肊匇议阣芅屹伇亦忔异抑坄耴苅杙呓邑劮伿佚役译枍呭易呹峄秇佾炈泆怈怿诣妷绎驿玴枻轶昳帠俋弈奕帟疫浂衵羿挹栧栺酏貤唈欭垼益浳浥悒袣谊陭埸埶勚萟殹悘豛隿異釴逸訲悥訳豙翊羛翌棭軼殔晹敡跇幆骮鈠詍焲湙絏搤亄肄獈詣裛痬裔意竩義兿溢缢駅蓺靾勩榏蜴膉廙瘗潩嫕撎槸鹝黓镒億誼瘞毅鹢熼熠熤墿薏瞖殪曀螠嶧圛穓儗劓艗瘱燚澺懌憶褹嬑嬟縊檍翳曎斁歝貖臆燡燱寱翼藝藙贀镱鎰癔豷霬鶍鶂鶃鯣繹繶蘙醳醷饐譯議瀷鷊囈鐿鷁懿鷖驛鷧襼虉鷾齸讛乚囙因阥阴侌茵荫垔音洇姻骃栶氤殷陰铟秵凐裀陻隂堙喑筃愔婣絪蒑蔭歅溵禋慇銦瘖鞇磤緸駰霒諲霠闉噾濦韾冘乑苂吟犾玪烎斦垠泿珢荶訔圁狺訚粌峾唫崟崯银訡淫寅婬龂鈝欽鄞碒滛蔩龈銀夤璌殥噖誾膶檭蟫嚚霪齦鷣尹引吲饮蚓隐淾釿鈏飲靷飮隠朄趛瘾檃隱螾嶾濥蘟齗櫽癮讔廴印岃茚胤洕垽堷猌湚廕酳慭癊憖憗鮣懚檼応英珱莺桜偀婴渶愥媖绬瑛焽朠煐碤锳嫈撄賏蝧嘤罂甇缨緓璎樱霙鹦鍈罃褮嬰膺韺甖鹰鶧攖蘡罌嚶譍瀴孾孆瓔櫻礯譻鶯鑍鷪蠳纓軈鷹鸎鸚迎盁茔荥荧盈莹萤营萦桯蛍営萾溁溋蓥楹僌塋滢蝇滎熒潆蝿瑩嬴螢營縈藀赢覮謍濚濴濙鎣攍蠅巆瀛瀯瀠櫿贏灐籝灜籯郢矨浧梬颍颕颖摬影潁頴穎瘿巊鐛廮癭应映硬暎媵膡噟應瀅哟唷喲佣拥痈邕庸嗈傭鄘雍墉滽慵嫞槦銿牅擁噰镛郺壅澭臃癕雝鏞鳙廱灉鱅鷛饔癰鰫永甬咏泳怺栐俑勇勈埇柡涌悀恿硧惥詠湧愑塎蛹嵱愹彮踊慂鲬禜踴鯒用苚砽醟优攸忧呦泑怮幽悠麀滺憂鄾優嚘瀀懮櫌耰纋尢尤尣由邮犹沋肬油怞怣疣斿莤莜莸逌蚘峳铀郵秞浟逰蚰偤訧鱿猶遊游楢鈾鲉猷駀輏蕕蝣魷輶鮋櫾邎友有苃酉丣卣羑莠羐庮聈梄铕脜蒏湵蜏禉銪槱牗牖黝又右幼佑侑狖糿孧柚迶哊囿峟牰宥祐诱姷唀梎蚴痏釉貁亴酭誘鼬込迂迃扜纡於陓虶紆唹盓淤瘀箊于亐邘伃汙汚玗玙扵杅欤余妤盂臾鱼衧茰禺竽舁俞兪酑狳馀悇谀娱娛娯萸雩釪魚渔隅隃堣堬揄楰硢畭喁嵎崳嵛骬畬逾腴湡渝愉媮婾瑜榆楡虞愚牏艅觎歈睮舆漁窬褕蕍歶颙蝓雓餘魣諛羭踰覦澞懙嬩璵輿歟鍝螸礖顒髃鮽謣騟籅鯲旟蘛鰅鷠鸆与予屿伛宇羽雨穻挧俣俁禹语圄峿祤敔匬圉偊鄅庾萭萮铻斞瑀楀與傴瘐寙語龉鋙窳藇噳嶼貐斔麌蘌齬玉驭圫芋芌聿饫忬妪郁育茟昱秗狱栯彧砡峪钰俼浴预域堉喐悆欲逳袬阈淢淯惐谕琙馭棫棜棛硲遇喅喻喩御鹆飫庽焴寓裕媀矞蒮蓣罭稢艈鈺愈煜滪誉預輍戫蜮蜟嶎毓僪銉獄瘉澚隩嫗緎鳿墺薁蓹噊稶鋊慾遹豫蕷閾閼鴥錥諭燠燏澦鴪鴧礇儥魊禦鹬醧穥篽礜鵒癒繘櫲饇霱轝譽鐭驈欎鬻籞鱊鷸鸒欝龥鬰軉鬱籲灪爩囦鸢剈眢鸳冤弲渁渊渆渕寃葾淵惌蒬棩蜎鹓鳶蜵駌鋺鴛鵷嬽灁鼘鼝元円邧贠芫园员沅妧杬垣爰袁原蚖員圆笎酛厡鼋援喛圎傆鈨猨湲媛缘塬蒝楥園圓猿獂溒源媴嫄榬榞辕褑蝯蝝魭褤縁緣薗橼螈羱黿轅謜鎱櫞邍騵鶢鶰厵远盶逺遠夗肙茒苑妴怨院垸衏掾瑗禐愿裫噮願曰曱约約箹矱彟彠月戉刖汋抈岄礿玥枂岳恱軏蚎蚏钺阅悅悦捳跃跀越粤楽粵鉞閱閲樂樾篗嬳嶽龠籆蘥黦瀹躍爚禴躒籥鸑籰鸙晕蒀蒕辒暈氲煴氳奫蝹輼赟頵轀馧贇云勻匀伝芸囩沄妘纭昀眃畇郧秐耘耺涢紜雲鄖蒷筼愪熉鋆蕓澐橒篔縜繧允阭抎夽狁玧陨荺殒喗鈗隕溳馻殞褞磒賱霣齫齳孕运枟郓恽貟酝鄆傊愠惲運缊韫腪韵慍熅蕰蕴熨緼薀醖縕醞餫鞰藴韞韗蘊韻帀匝迊沞咂拶桚鉔魳臜臢杂沯砸韴雑磼襍雜囐雥咋灾災甾哉栽烖菑渽溨睵賳仔载宰崽載扗再在洅傤酨儎縡兂糌簮簪鐟鐕咱偺昝寁揝撍噆儧攒儹攢趱趲暂賛暫錾赞鄼蹔酂濽瓉鏨贊瓒酇囋讃灒瓚禶穳襸讚饡喒赃脏羘牂賍臧賘贓髒贜驵駔弉奘塟葬銺臓臟遭糟醩蹧凿鑿早枣栆蚤棗璅澡璪薻藻繰皁皂灶唕唣造梍喿艁煰慥噪簉燥趮躁譟竈则択沢责择迮泎泽則責萚啧啫唶帻笮舴溭矠蔶嘖幘箦嫧赜樍歵諎擇瞔皟澤耫簀賾礋謮襗蘀蠌齚齰鸅夨仄庂汄昃昗捑崱贼戝賊鲗蠈鰂鱡怎谮譛譖囎増鄫增憎璔橧熷磳罾矰譄鱛锃鋥缯赠甑繒贈扎吒抯挓柤紥哳紮偧揸喳渣溠楂皶劄箚樝觰皻蹅譇囃齄齇札轧甴闸蚻铡閘牐煠霅鍘譗厏苲眨砟搩鲝踷鮺乍灹诈柵柞栅奓咤炸痄宱蚱詐搾鲊摣榨鮓醡夈粂捚斋斎摘榸齋宅翟窄鉙债砦債寨瘵枬沾毡栴旃蛅飦粘趈詀惉閚詹谵薝霑噡嶦邅氊氈覱瞻鹯旜譫饘鳣驙魙鸇讝拃斩飐盏展斬崭琖搌盞榐辗嶃嶄颭醆嫸橏輾蹍皽黵占佔栈战桟站菚偡绽棧湛戦綻輚嶘虦虥戰轏驏蘸弡张章張傽鄣蔁獐彰遧粻漳慞嫜璋樟暲餦蟑騿鱆麞长仉涨涱掌漲幥鞝礃丈仗扙杖帐账胀粀帳脹痮障墇嶂幛賬瞕瘴瘬钊佋招妱巶昭盄釗釽鉊駋鍣窼爪爫找沼菬瑵召兆诏枛赵垗狣炤笊肁棹詔旐照罩趙箌肈肇曌鮡燳櫂瞾羄蜇嗻遮嫬乛厇折矺歽砓虴籷埑哲粍袩晢悊辄晣啠喆蛰棏詟谪摺輒樀輙磔銸辙蟄嚞謺鮿謫轍讁讋襵者禇锗赭鍺褶这柘這浙淛蔗樜鹧蟅鷓着贞针侦珍珎枮貞帧胗浈真栕桢砧帪針眞祯桭酙偵葴遉湞寊搸靕蓁斟蒖楨甄鉁獉禎瑧榛槇碪殝禛箴潧薽樼臻錱澵轃鍖鍼籈鱵诊抮枕轸昣弫姫眕畛疹袗屒聄萙紾軫覙診裖嫃缜駗稹縥縝辴鬒黰圳阵纼挋侲鸩陣振栚朕紖眹赈揕塦蜄絼賑誫敶震镇鋴鴆鎮鎭黮凧争佂征爭怔姃埩峥狰炡眐钲烝掙聇睁崝崢铮猙揁筝媜蒸睜踭徰鉦箏徴錚鬇篜癥氶抍糽拯掟晸愸撜整正证郑诤政挣症幀証諍塣鄭鴊證之支只卮汁芝吱巵汥枝知肢织栀秓秖胑胝衼衹祗秪倁隻脂疷祬梔椥臸戠搘禔馶榰蜘鳷鴲織蘵鼅禵执坧直侄姪聀值値釞埴執职淔絷植殖跖犆禃瓡稙馽墌摭漐慹踯嬂樴膱縶職蹠蹢蟙軄躑夂止劧凪旨阯址坁扺芷帋沚汦纸抧茋泜祉指枳砋轵洔恉咫茝疻淽紙趾訨軹黹酯徵藢襧阤芖至扻志豸忮垁厔郅帜帙制质炙治挃栉柣峙俧庤庢洷祑陟贽挚桎轾致歭晊秩徏胵狾袟娡鸷掷梽眰畤铚秷偫貭徝乿猘觗袠痔窒翐紩蛭崻智傂痣滞骘彘搱輊跱置锧雉稚筫廌滍寘綕墆覟疐製銍誌瘈滯潌摯踬幟稺質憄鋕膣觯熫潪駤薙鴙旘瀄隲緻擿擲櫛螲穉儨劕懥贄懫瓆櫍鯯觶騭礩豑鶨驇騺鷙躓鑦鑕豒中伀汷彸妐刣忠炂泈终柊盅钟衳舯衷終鈡蔠幒锺鴤螤鍾螽鼨蹱鐘籦肿种冢尰塚歱腫煄種瘇踵仲众狆妕祌茽衶蚛眾偅堹筗衆媑諥舟州诌侜周炿洀洲珘辀郮烐啁矪徟鸼週淍婤喌赒粥輈銂輖賙駲霌盩嚋鵃謅騆譸妯轴軸碡肘疛菷晭睭箒鯞纣伷呪咒宙绉荮冑胄昼紂酎皱粙晝葤詋甃駎僽皺噣縐骤籀籕籒驟帚朱劯邾侏诛茱咮洙珠株诸硃铢秼猪袾蛛絑跦誅蕏槠蝫銖潴豬橥諸駯鴸鮢藸藷瀦櫧櫫鼄鯺騶蠩竹竺泏茿笁炢逐烛窋笜舳蓫瘃敳燭蠋躅鱁劚灟孎欘曯爥斸蠾钃主拄宔罜陼渚煑煮詝嘱濐麈瞩囑矚伫苎芧助住佇纻坾苧杼贮迬注驻壴柷柱殶炷祝莇砫眝疰竚祩著蛀羜紸紵軴貯跓嵀铸筑註馵筯鉒飳墸翥箸駐樦鋳霔築篫麆鑄抓檛膼髽簻跩拽专叀専砖耑專剸鄟塼嫥瑼甎磗颛膞磚諯蟤顓鱄转孨転竱灷啭堟蒃瑑赚僎撰篆馔篹賺襈縳轉簨譔饌囀籑妆庄庒妝荘莊桩娤梉装粧湷裝樁糚丬壮状壯狀壵焋撞幢戅戇隹追骓椎锥錐騅鵻沝坠笍娷缀甀腏惴缒硾畷膇赘墜綴醊諈縋錣餟贅礈轛鑆迍宒肫窀谆啍訰諄衠准埻凖稕準綧拙炪捉桌倬棁涿琸棳槕蝃穛鐯穱蠿圴彴犳灼茁卓妰叕斫浊酌丵烵浞诼梲啄啅娺琢斱斮椓晫硺罬窧窡擆撯禚斲劅鋜諑諁篧濁擢斀斵濯櫡镯謶鵫蠗灂鐲籗鷟籱孖孜茊茲姕咨姿兹赀栥资玆紎赼崰秶淄谘缁葘鄑孶椔辎嗞嵫粢孳湽滋趑貲锱訿資禌龇鈭镃稵緇鼒輜髭趦輺錙鲻諮澬鍿鎡頾頿鯔齍鶅鰦齜子吇杍姉姊矷秄胏耔呰虸秭籽笫梓釨啙紫訾滓榟橴芓自字荢茡剚牸倳恣眥眦渍胾胔漬宗倧综骔堫葼棕嵏嵕腙猣惾椶朡嵸稯緃綜踨踪蝬熧艐翪磫鍐鬃騌豵蹤鬉騣鬷鯮鯼鑁总捴偬揔搃惣蓗傯摠総縂燪鍯總鏓纵昮疭倊猔碂粽糉緵錝瘲縦繌縱邹驺郰诹陬掫菆棸棷鄒箃緅諏鄹鲰鯫黀齺辶赱走鯐奏揍租菹葅蒩鉏錊卆足卒哫倅紣崒崪族稡箤綷踤踿镞鏃诅阻岨组珇俎爼祖唨組詛靻鎺謯劗躜躦繤缵纂纉籫纘钻攥鑚鑽厜朘嗺樶蟕纗觜嶊嘴嶵噿璻枠栬酔絊最晬祽罪辠槜蕞醉檇鋷檌穝欈尊墫嶟遵樽罇繜鶎鐏鳟鱒鷷僔撙噂譐捘銌嘬昨莋秨稓筰鈼阝左佐繓作坐阼岝岞怍侳胙祚唑座袏做葃葄酢蓙飵糳咗乤乥乫乬乭乮乯乲乶乺乻乼乽亪侤兺匁厼叾哛唜唟喸嗭囕壭夞岾巪巼廤怾旀旕曢朑朰栍桛椧榋歚毮浌烪猠瓱畓癷硳穒縇聁聣莻蒊虄虲袰襨鐢閪闏霻鶑',

        getOrderedUnicode: function (char) {
            var originalUnicode = char.charCodeAt();

            if (originalUnicode >= 0x4E00 && originalUnicode <= 0x9FA5) {

                var index = this.db.indexOf(char);

                if (index > -1) {
                    return index + 0x4E00;
                }
            }

            return originalUnicode;
        },

        compare: function (a, b) {

            if (a == b) {
                return 0;
            }

            if (a.length == 0) {
                return 1;
            }
            if (b.length == 0) {
                return -1;
            }
            var count = a.length > b.length ? b.length : a.length;
            for (var i = 0; i < count; i++) {
                var au = this.getOrderedUnicode(a[i]);
                var bu = this.getOrderedUnicode(b[i]);

                if (au > bu) {
                    return 1;
                } else if (au < bu) {
                    return -1;
                }
            }

            return a.length > b.length ? 1 : -1;

        }

    };

    String.prototype.localeCompare = function (param) {
        try {
            return CompareStrings.compare(this.toString(), param);
        } catch (e) {
            console.log(this.toString(), param);
            console.trace('localeCompare');
        }
    };
}));