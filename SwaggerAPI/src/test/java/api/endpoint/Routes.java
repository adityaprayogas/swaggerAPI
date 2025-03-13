package api.endpoint;


public class Routes {
	
	public static String base_url = "https://petstore.swagger.io/v2";
	
	public static String post_url = base_url + "/user";
	public static String get_url = base_url + "/user/{username}";
	public static String put_url = base_url + "/user/{username}";
	public static String delete_url = base_url + "/user/{username}";
	public static String postArray_url = base_url + "/user/createWithArray";
	public static String postList_url = base_url + "/user/createWithList";
	
	public static String store_postUrl = base_url + "/store/order";
	public static String store_getUrl = base_url + "/store/order/{orderid}";
	public static String store_deleteUrl = base_url + "/store/order/{orderid}";
}
