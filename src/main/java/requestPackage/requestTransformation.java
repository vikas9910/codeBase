package requestPackage;

import java.io.IOException;

import org.testng.Assert;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class requestTransformation {

	private int statusCode;
	private static final MediaType jsontype=MediaType.parse("application/json; charset=utf-8");
	
	OkHttpClient okHttp=new OkHttpClient();
	
	
	public void getRequest(String endPoint) throws IOException
	{
		Request request=new Request.Builder().url(endPoint).build();
		
		Response response=okHttp.newCall(request).execute();
		Assert.assertTrue(response.code()==200);
		
		
	}
	public void setStatusCode(int statusCode)
	{
		this.statusCode=statusCode;
	}
	public int getStatusCode()
	{
		return this.statusCode;
	}
	
	public void postRequest(String requestBody,String URL) throws IOException
	{
		RequestBody body=RequestBody.create(jsontype,requestBody);
		
		Request request=new Request.Builder().post(body).build();
		
	    Response response=okHttp.newCall(request).execute();
	    
	    Assert.assertEquals(response.code(),200);
		this.setStatusCode(response.code());
		
	}
	
}
