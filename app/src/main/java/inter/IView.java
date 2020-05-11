package inter;

public class IView {

   public interface ILoginView{

        String getUserName();
        String getPassWord();
        void showToast(String content);
        void showProgress();
        void hideProgress();
        void toOtherActivity();

    }
}
