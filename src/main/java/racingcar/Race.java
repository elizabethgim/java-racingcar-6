package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class Race {
    public void start(){
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String input = Console.readLine();
        List<String> cars = List.of(input.split(","));

        System.out.println("시도할 회수는 몇회인가요?");
        int count = Integer.parseInt(Console.readLine());

   }
}
