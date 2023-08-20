package org.example.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ルーレット - Concrete Aggregate の役割
 */
public class RouletteArrayList implements Iterable<RouletteNumber> {
  private List<RouletteNumber> roulette;

  public RouletteArrayList(int size) {
    this.roulette = new ArrayList<>(size);
  }

  public RouletteNumber getRouletteAt(int index){
    return roulette.get(index);
  }

  public void appendRouletteNumber(RouletteNumber rouletteNumber){
    roulette.add(rouletteNumber);
  }

  public int getLength(){
    return roulette.size();
  }

  // 呼び出し元のクラスだけ変えれば完了
  @Override
  public Iterator<RouletteNumber> iterator() {
    return new Dealer(this);
  }
}
