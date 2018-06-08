package page;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import common.BaseClass;
import lombok.Data;

@Data
public class GoogleHomePage extends BaseClass{
	String title = driver.getTitle();

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
