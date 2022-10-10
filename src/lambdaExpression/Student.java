package lambdaExpression;

// FunctionExample 클래스 list를 사용하기 위한 클래스
public class Student {
    // 필드
    private String name;
    private int englishScore;
    private int mathScore;

    // 생성자
    public Student(String name, int englishScore, int mathScore){
        this.name = name;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
    }

    // get 메서드
    public String getName(){
        return name;
    }
    public int getEnglishScore(){
        return englishScore;
    }
    public int getMathScore(){
        return mathScore;
    }
}
