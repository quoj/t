package m;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        News news = new News();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tiêu đề tin tức: ");
        String title = scanner.nextLine();
        news.setTitle(title);

        System.out.print("Nhập ngày xuất bản: ");
        String publishDate = scanner.nextLine();
        news.setPublishDate(publishDate);

        System.out.print("Nhập tác giả: ");
        String author = scanner.nextLine();
        news.setAuthor(author);

        System.out.print("Nhập nội dung: ");
        String content = scanner.nextLine();
        news.setContent(content);

        news.InputRate();

        news.Display();
    }
}