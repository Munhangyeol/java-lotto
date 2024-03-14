package lotto.lotto;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validateRange(numbers);
        validateDuplicate(numbers);
        this.numbers = numbers;

    }
    private void validateRange(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }

    }
    private void validateDuplicate(List<Integer> numbers){
        HashSet<Integer> set = new HashSet<>(numbers);
        //집합에서는 중복을 허용하지 않음. 이게 낫나 2중 반복이 낫나.
        if(set.size()!=6){
            throw new IllegalArgumentException();
        }
    }
    public int howManySameNumebr(List<Integer> answer){
        int sameNumber=0;
        for (Integer i: answer){
            if(numbers.contains(i)==true){
                sameNumber += 1;
            }
        }
        return sameNumber;
    }
    public boolean isSameBouns(Integer bonus){
       if(numbers.contains(bonus)){
           return true;
       }
        return false;
    }


    // TODO: 추가 기능 구현
}