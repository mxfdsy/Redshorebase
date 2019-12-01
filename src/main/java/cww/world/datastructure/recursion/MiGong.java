package cww.world.datastructure.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class MiGong {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("1", "2", "3", "4");
        HashSet<String> hashSet = new HashSet<>();
        ArrayList<String> results = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            StringBuilder stringBuilder = new StringBuilder();
            hashSet.add(strings.get(i));
            stringBuilder.append(strings.get(0));

            for (int j = 0; i < strings.size(); j++) {
                if (hashSet.contains(strings.get(j))) {
                    continue;
                }
                hashSet.add(strings.get(j));
                stringBuilder.append(strings.get(j));

                for (int k = 0; i < strings.size(); k++) {
                    if (hashSet.contains(strings.get(k))) {
                        continue;
                    }
                    hashSet.add(strings.get(j));
                    stringBuilder.append(strings.get(k));

                    for (int o = 0; i < strings.size(); o++) {
                        if (hashSet.contains(strings.get(o))) {
                            continue;
                        }
                        stringBuilder.append(strings.get(o));
                        results.add(stringBuilder.toString());
                    }

                }



            }

        }

        System.out.println(results.size());


        int[][] map = new int[8][7];
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }

        for (int i = 0; i < 8; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }
        map[3][1] = 1;
        map[3][2] = 1;

        System.out.println("地图的情况");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        setWay(map, 1, 1);

        System.out.println("走完后 地图的情况");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }


    /**
     * @param map 地图
     * @param i   行
     * @param j   列 从 （1，1）出发
     * @return 如果 到map[6][5]则通路找到
     * 约定：map[i][j] = 1墙，2 通路 3 已经走过 但是走不通
     * 走路策略 下 ->右->上->左 如果该点走不通在回溯
     */
    public static boolean setWay(int[][] map, int i, int j) {
        if (map[6][5] == 2) {
            return true;
        } else {
            if (map[i][j] == 0) {
                map[i][j] = 2;
                if (setWay(map, i + 1, j)) {
                    return true;
                } else if (setWay(map, i, j + 1)) {
                    return true;
                } else if (setWay(map, i - 1, j)) {
                    return true;
                } else if (setWay(map, i, j - 1)) {
                    return true;
                } else {
                    map[i][j] = 3;
                    return false;
                }
            } else {// 可能 1 2 3
                return false;
            }
        }
    }
}

