public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "444 № 44444444";
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Иванов";
        post.birthday = new FormDate();
        post.birthday.day = String.valueOf(13);
        post.birthday.month = String.valueOf(06);
        post.birthday.year = String.valueOf(2002);
        // заполните другие поля
        System.out.println();
    }
}
