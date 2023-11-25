// News.java
package m;

import java.util.Scanner;

// Tạo một lớp có tên News
public class News implements INews {
    private String Title;
    private String PublishDate;
    private String Author;
    private String Content;
    private float AverageRate;
    private final int[] RateList = new int[3];

    public void setTitle(String Title) { this.Title = Title; }

    public void setPublishDate(String PublishDate) { this.PublishDate = PublishDate; }

    public void setAuthor(String Author) { this.Author = Author; }

    public void setContent(String Content) { this.Content = Content; }


    public void Display() {
        System.out.println("Tiêu đề: " + Title);
        System.out.println("Ngày xuất bản: " + PublishDate);
        System.out.println("Tác giả: " + Author);
        System.out.println("Nội dung: " + Content);
        System.out.println("Đánh giá trung bình: " + AverageRate);
    }

    public void Calculate() {
        AverageRate = (float)(RateList[0] + RateList[1] + RateList[2]) / 3;
    }

    public void InputRate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ba giá trị đánh giá:");
        for (int i = 0; i < 3; i++) {
            RateList[i] = scanner.nextInt();
        }
        Calculate();
    }
}