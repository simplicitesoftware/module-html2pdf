package com.simplicite.objects.Html2Pdf;

import java.util.*;
import com.simplicite.util.*;
import com.simplicite.util.tools.*;
import org.json.JSONObject;

/**
 * Business object H2fWkhtml2pdf
 */
public class H2fWkhtml2pdf extends ObjectDB {
	private static final long serialVersionUID = 1L;
	
	public String makePdf() {
		getField("h2pWkFile").setDocument(this, "wkhtml2pdf.pdf", pubPdf(getFieldValue("h2pWkUrl"), getFieldValue("h2pWkHtml")));
		getField("h2pWkTool").setDocument(this, "HTMLToPDFTool.pdf", pubPdfTool(getFieldValue("h2pWkHtml")));
		save();
		return null;
	}
	
	public byte[] pubPdfTool(String html){
		try{
			return HTMLToPDFTool.toPDF(html);
		}
		catch(Exception e){
			AppLog.error(getClass(), "pubPdf", "------------", e, getGrant());
			return null;
		}
	}
	
	public byte[] pubPdf(String url, String html){
		String user = null;
		String password = null;
		JSONObject postData = new JSONObject();
		postData.put("contents", Tool.toBase64(html));
		String[] headers = {"Content-Type:application/json"};
		String encoding = Globals.BINARY;
		byte[] pdf = null;
		
		try{
			pdf = Tool.readUrlAsByteArray(url, user, password, postData.toString(), headers, encoding);
		}catch(Exception e){
			AppLog.error(getClass(), "pubPdf", "------------", e, getGrant());
		}
		return pdf;
	}
}
