package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Menu> menuList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int menuId = 1;

        System.out.println("== 주문을 시작합니다 ==");


        String[] orderList = new String[10];

        while (true) {
            System.out.println("☆★☆★ 얼어죽어도 아이스만 ☆★☆★");
            System.out.println("1. 주문하기");
            System.out.println("2. 메뉴옵션변경");
            System.out.println("3. 장바구니");
            System.out.println("4. 끝내기");
            System.out.print("입력: ");
            int num = sc.nextInt();

            if (num == 1) {
                System.out.println("1. 아메리카노\t3800원");
                System.out.println("2. 에스프레소\t2400원");
                System.out.println("3. 카페라떼\t4200원");
                System.out.println("4. 밀크티\t5100원");
                System.out.println("5. 딸기스무디\t5500원");
                System.out.println("6. 망고스무디\t5600원");
                System.out.println("7. 블루베리스무디\t6000원");
                System.out.println("8. 마카롱\t3000원");
                System.out.println("9. 케이크\t5000원");
                System.out.println("10. 쿠키\t1000원");

                System.out.print("메뉴선택: ");
                while (true) {
                    String menuName = "";
                    int menuPrice = 0;
                    int menuNum = sc.nextInt();

                    if (menuNum == 1) {
                        menuName = "아메리카노";
                        menuPrice = 3800;
                    } else if (menuNum == 2) {
                        menuName = "에스프레소";
                        menuPrice = 2400;
                    } else if (menuNum == 3) {
                        menuName = "카페라떼";
                        menuPrice = 4200;
                    } else if (menuNum == 4) {
                        menuName = "밀크티";
                        menuPrice = 5100;
                    } else if (menuNum == 5) {
                        menuName = "딸기스무디";
                        menuPrice = 5500;
                    } else if (menuNum == 6) {
                        menuName = "망고스무디";
                        menuPrice = 5600;
                    } else if (menuNum == 7) {
                        menuName = "블루베리스무디";
                        menuPrice = 6000;
                    } else if (menuNum == 8) {
                        menuName = "마카롱";
                        menuPrice = 3000;
                    } else if (menuNum == 9) {
                        menuName = "케이크";
                        menuPrice = 5000;
                    } else if (menuNum == 10) {
                        menuName = "쿠키";
                        menuPrice = 1000;
                    }
                    System.out.println("얼음량을 선택해주세요");
                    System.out.println("1. 100%");
                    System.out.println("2. 70%");
                    System.out.println("3. 50%");
                    System.out.println("4. 넣지않음");

                    System.out.print("얼음량: ");
                    int ice = sc.nextInt();

                    System.out.println("시럽횟수를 선택해주세요");
                    System.out.println("1. 1번");
                    System.out.println("2. 2번");
                    System.out.println("3. 3번");
                    System.out.println("4. 넣지않음");

                    System.out.print("시럽횟수: ");
                    int syrup = sc.nextInt();


                    System.out.println(menuName + "을(를) 장바구니에 담았습니다.");

                    Menu menu = new Menu(menuId ,menuName, menuPrice, ice, syrup);
                    menuList.add(menu);
                    menuId++;

                    break;
                }
            }else if (num == 2) {
                System.out.println("옵션 변경 할 메뉴 번호를 입력해 주세요!");
                for (Menu menu : menuList) {
                    System.out.printf("%d. %s(%d,%d): %d \n", menu.getMenuId(), menu.getMenuName(), menu.getIce(),menu.getSyrup(), menu.getMenuPrice());
                }

                int modifyId = sc.nextInt();

                for (Menu menu : menuList) {
                    if (menu.getMenuId() == modifyId) {
                        System.out.print("얼음량: ");
                        int ice = sc.nextInt();
                        menu.setIce(ice);
                        System.out.print("시럽횟수: ");
                        int syrup = sc.nextInt();
                        menu.setSyrup(syrup);
                    }
               }
                System.out.println(modifyId + "번 메뉴 옵션이 변경 되었습니다.");
            }
            else if (num == 3) {
                for (Menu menu : menuList) {
                    System.out.printf("%d. %s(%d,%d): %d \n", menu.getMenuId(), menu.getMenuName(), menu.getIce(),menu.getSyrup(), menu.getMenuPrice());
                }
            }else if (num == 4) {
                System.out.println("반복 종료");
            }
        }


    }
}



class Menu {
    private int menuId;
    private String menuName;
    private int menuPrice;
    private int ice;
    private int syrup;


    Menu(int menuId, String menuName, int menuPrice, int ice, int syrup) {
        this.menuId = menuId;
        this.menuName = menuName;
        this.menuPrice = menuPrice;
        this.ice = ice;
        this.syrup = syrup;
    }

    public int getMenuId() {
        return this.menuId;
    }
    public String getMenuName() {
        return this.menuName;
    }

    public int getMenuPrice() {
        return this.menuPrice;
    }

    public int getIce() {
        return this.ice;
    }

    public int getSyrup() {
        return this.syrup;
    }
    public void setIce(int ice) {
        this.ice = ice;
    }

    public void setSyrup (int syrup) {
        this.syrup = syrup;
    }
}