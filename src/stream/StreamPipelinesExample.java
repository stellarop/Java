package stream;

// 스트림은 데이터의 필터링,매핑,정렬,그룹핑 등 중간 처리와
// 합계,평균,최대값,최소값 등 최종 처리를 파이프라인 으로 해결한다.
// 파이프라인은 여러 개의 스트림이 연결되어 있는 구조

import java.util.Arrays;
import java.util.List;

// 스트림 파이프라인
public class StreamPipelinesExample {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("김세연", Member.women, 21),
                new Member("이연재", Member.men, 24),
                new Member("백성현", Member.men, 25),
                new Member("백소진", Member.women, 28)
        );

        // list 에 저장된 오리지널 스트림 객체
        double ageAvg = list.stream()
                // 중간 처리 스트림(list 객체에서 남자만 필터링한다.)
                .filter(m -> m.getSex()==Member.men)
                // 남자만 필터링된 값에서 나이를 가져온다.
                .mapToInt(Member :: getAge)
                // 최종처리 (남자 평균 나이를 구한다)
                .average()
                .getAsDouble();

        System.out.println("남자 평균 나이 : " + ageAvg);
    }
}
