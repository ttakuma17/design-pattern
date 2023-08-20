package org.example.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    // 固定配列でルーレット定義してる時
    Roulette roulette = new Roulette(8);
    roulette.appendRouletteNumber(new RouletteNumber(1));
    roulette.appendRouletteNumber(new RouletteNumber(2));
    roulette.appendRouletteNumber(new RouletteNumber(3));
    roulette.appendRouletteNumber(new RouletteNumber(4));
    roulette.appendRouletteNumber(new RouletteNumber(5));
    roulette.appendRouletteNumber(new RouletteNumber(6));
    roulette.appendRouletteNumber(new RouletteNumber(7));
    roulette.appendRouletteNumber(new RouletteNumber(8));

    // Dealerクラスを呼び出す処理
    Iterator<RouletteNumber> it = roulette.iterator();
    // 球の入った数字
    int target = (int)(Math.random() * roulette.getLength());
    // hasNext() は Dealerからの呼び出し
    while (it.hasNext()){
      // next() は Dealerからの呼び出し
      RouletteNumber rouletteNumber = it.next();
      // 当たりの値とルーレット内に定義されているものかチェック
      if (rouletteNumber.getNum() == target) {
        System.out.println(target);
        System.out.println("当たりは" + rouletteNumber.getNum() + "です");
      }
    }
  }
}
