package lambdaExpression;

// FunctionExample Ŭ���� list�� ����ϱ� ���� Ŭ����
public class Student {
    // �ʵ�
    private String name;
    private int englishScore;
    private int mathScore;

    // ������
    public Student(String name, int englishScore, int mathScore){
        this.name = name;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
    }

    // get �޼���
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
