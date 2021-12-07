package com.company;
import java.util.Stack;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("pen");
        stack.push("pencil");
        stack.push("book");
        stack.push("bag");
        System.out.println("Stack : " + stack);
// Стекты экранга шыгарып жане онын бостыгын тексеру
        System.out.println("Is Stack empty? : " + stack.isEmpty());
// Стек размерын size() аркылы табу
        System.out.println("Size of Stack : " + stack.size());
// search() әдісі 1-ден бастап стектің жоғарғы жағындағы элемент орнын қайтарады
// Элемент стектен табылмаса -1 қайтарады
        int position = stack.search("pencil");
        if (position != -1) {
            System.out.println("Found the element \"pencil\" at position : " + position);
        } else {
            System.out.println("Element not found");

        }
    }
}
// Алгоритм күрделігі: О(n)
// Себебі: Push() алгоритмнің күрделілігі O (1) – тұрақты. Себебі: операциялардың саны өспейді
// және кіріс деректерінің кез келген мәндері үшін тұрақты.  Бөлім амалдар санын көрсетпейді,
// сондықтан күрделілік тұрақты болады.
//Pop() алгоритмнің күрделілігі O (1) – тұрақты. Себебі: операциялардың саны өспейді және
// стекте элемент енгізілуі, жоюлуы,ізделіну операцияларына тұрақты болып келеді.
// Амалдар саны жоқ, сондықтан  O(1)- const
//Search () алгоритмнің күрделілігі O (n)-сызықтық. Себебі: тізімнің басындағы элементтерді
// өңдеу арқылы біз барлық кейінгі элементтердің индекстерін жаңартуымыз керек болғансон.
//Есептеу жолы бойынша O(1) * O(1) * O(n)= O(n)