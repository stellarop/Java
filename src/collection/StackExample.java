package collection;

import java.util.Stack;

// Stack
// 후입선출 구조로 나중에 넣은 객체가 먼저 빠져나가는 자료구조.
public class StackExample {
    public static void main(String[] args) {
        // Stack 선언
        Stack<Coin> coinBox = new Stack<Coin>();

        // 동전을 끼운다.(push)
        coinBox.push(new Coin(100));
        coinBox.push(new Coin(50));
        coinBox.push(new Coin(500));
        coinBox.push(new Coin(10));

        // 동전 케이스가 비었는지 확인
        while (!coinBox.isEmpty()){
            // 동전 케이스에 가장 나중에 끼운 동전 꺼내기
            Coin coin = coinBox.pop();
            System.out.println("꺼낸 동전 : " + coin.getValue() + "원");
        }
    }
}
