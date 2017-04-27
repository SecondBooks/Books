package service;

public interface CustomerService {
	
	public boolean register(String account, String password);//处理注册的业务逻辑
	public boolean login(String account, String password);//处理登陆的业务逻辑
    public boolean payment();//用户支付
    public boolean collectBooks();//书籍收藏
    public boolean carOfItems();//购物车
    public boolean comment();//评论
    public boolean searchingBooks(String keyWord);//关键搜索书
}
