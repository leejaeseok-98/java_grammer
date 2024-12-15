package C02ClassBasic;

//        1.회원가입 : 이름, 이메일, 비밀번호, id값(auto_increment)
//        2.회원 전체 목록 조회 : id, email
//        3.회원 상세 조회(id로 조회) : id, email, name, password, 작성글수
//        4.게시글 작성 : 제목, 내용, 작성자Email -> author_id를 찾아서 author_id로 변경 입력, id값(auto_increment)
//        5.게시물 목록 조회 : id(post), title
//        6.게시물 상세 조회 : id(post), title, contents, 작성자email
//        7.서비스 종료

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardService {
    public static void main(String[] args) {
        while (true){
            System.out.println("1.회원가입 2.회원 전체 조회 3.회원상세조회 4.게시글 작성 5.게시물 목록 조회 6.게시물 상세 조회 7. 서비스 종료");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            if (input.equals("1")){
                System.out.println("1.이름 2.E-mail 3.password를 입력해주세요");
                String name = sc.nextLine();
                String eMail = sc.nextLine();
                String passWord = sc.nextLine();
                Author author = new Author(name,eMail,passWord);

            }
            else if (input.equals("2")) {
                Author.AllAuthorSearch();
            }
            else if (input.equals("3")) {
                Author.DetailAuthorView();
            }
            else if (input.equals("4")) {
                System.out.println("제목을 입력해주세요");
                String title = sc.nextLine();
                System.out.println("내용을 입력해주세요");
                String contents = sc.nextLine();
                System.out.println("사용자 이메일을 입력해주세요");
                String email = sc.nextLine();
                Post post = new Post(title,contents,email);
            }
            else if (input.equals("5")) {
                Post.AllPostSearch();
            }
            else if (input.equals("6")) {
                Post.DetailPostView(1);
            }
            else if (input.equals("7")) {
                System.out.println("서비스를 종료합니다.");
                break;
            }
        }

    }


}
class Author{
    private String name = "";
    private String Email = "";
    private String PassWord = "";
    private static long static_id = 0L;
    private long id = 0L;


    private int postCount = 0;
    static List<Author> authors = new ArrayList<>();

    public Author(String name, String email, String passWord) {
        if (!addAuthor(email)){
            this.name = name;
            this.Email = email;
            this.PassWord = passWord;
            this.id = ++static_id;
            authors.add(this);
        } else {
            System.out.println("중복된 아이디가 있습니다.");
        }

    }
    public boolean addAuthor(String email){
        for (Author a : authors) {
            if (a.getEmail().equals(email)) {
                return true; // 중복 이메일 발견
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return Email;
    }

    public String getPassWord() {
        return PassWord;
    }

    public long getId() {
        return id;
    }

    public int getPostCount() {
        return postCount;
    }

    public void updatePostCount(int postCount) {
        this.postCount = postCount+1;
    }


    public static void AllAuthorSearch(){
        for (Author a : authors) {
            System.out.println("작성자ID : "+a.getId() + " " + " 작성자email : "+ a.getEmail());
        }
    }

    public static void DetailAuthorView(){
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        for (Author author : authors) {
            System.out.println("회원 id : " + author.getId()+ "회원 email : "+ author.Email +
                    "회원 이름 : "+ author.name + "회원 password : "+ author.PassWord + "회원 작성글 수 : " + author.postCount);
        }
    }

}

//        4.게시글 작성 : 제목, 내용, 작성자Email -> author_id를 찾아서 author_id로 변경 입력, id값(auto_increment)
//        5.게시물 목록 조회 : id(post), title
//        6.게시물 상세 조회 : id(post), title, contents, 작성자email

class Post{
    private String title;
    private String contents;
    private long author_id = 0L;
    private static long static_postId = 0L;
    private long postId = 0L;
    private String email;
    static List<Post> postList = new ArrayList<>();
    public Post(String title, String contents, String email) {
        this.title = title;
        this.contents = contents;
        this.email = email;
        boolean isValidAuthor = false;
        for (Author a : Author.authors) {
            if (a.getEmail().equals(email)) {
                this.author_id = a.getId();
                a.updatePostCount(a.getPostCount()); // 작성글 수 업데이트
                isValidAuthor = true;
                break;
            }
        }
        if (!isValidAuthor) {
            System.out.println("등록 권한이 없습니다.");
            return; // 게시글 추가 중단
        }
        postList.add(this);
        postId = ++static_postId;
    }

    public static long getStatic_postId() {
        return static_postId;
    }

    public String getEmail() {
        return email;
    }

    public long getPostId() {
        return postId;
    }

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }

    public long getAuthor_id() {
        return author_id;
    }

    public static void AllPostSearch(){
        for (Post post : postList) {
            System.out.println("post_id : "+post.getPostId() + " " + " 제목 : "+post.getTitle());
        }
    }
    public static void DetailPostView(long postId){
        for (Post post : postList) {
            if (post.getPostId() == postId){
                System.out.println("작성id : " + post.getPostId() + " 제목 : "+ post.getTitle() + " 내용 : " + post.getContents()
                + "작성자email : " + post.getEmail());
            }
        }
    }
}
