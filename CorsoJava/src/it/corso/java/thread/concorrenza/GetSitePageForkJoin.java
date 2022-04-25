package it.corso.java.thread.concorrenza;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.RecursiveTask;
import it.corso.java.Utils;

public class GetSitePageForkJoin extends RecursiveTask<String> {

	private String url;

	public GetSitePageForkJoin(String url) {
		this.url = url;
	}
		
	@Override
	protected String compute() {
		try {
			URL u = new URL(url);
			URLConnection con = u.openConnection();
			InputStream is = con.getInputStream();
			
			return Utils.getString(is);
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}


