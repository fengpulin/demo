package com.lfp.struts.action;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class UploadFileAction extends ActionSupport implements Serializable {

	/**
	 * 序列化
	 */
	private static final long serialVersionUID = -8257176685204461517L;

	/**
	 * 缓存大小
	 */
	private static final int BUFFER_SIZE = 16 * 1024;

	/**
	 * 上传的文件 <s:file name="xxx" />对应Action类里面的xxx、xxxContentType和xxxFileName三个属性
	 */
	private String caption;
	private File myFile;
	private String myFileContentType;
	private String myFileFileName;

	private String imageFileName;

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public File getMyFile() {
		return myFile;
	}

	public void setMyFile(File myFile) {
		this.myFile = myFile;
	}

	public String getMyFileContentType() {
		return myFileContentType;
	}

	public void setMyFileContentType(String myFileContentType) {
		this.myFileContentType = myFileContentType;
	}

	public String getMyFileFileName() {
		return myFileFileName;
	}

	public void setMyFileFileName(String myFileFileName) {
		this.myFileFileName = myFileFileName;
	}

	public String getImageFileName() {
		return imageFileName;
	}

	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}

	/**
	 * 
	 * @param src
	 * @param dst
	 */
	private static void copy(File src, File dst) {
		try {
			InputStream in = null;
			OutputStream out = null;
			try {
				in = new BufferedInputStream(new FileInputStream(src),
						BUFFER_SIZE);
				out = new BufferedOutputStream(new FileOutputStream(dst),
						BUFFER_SIZE);
				byte[] buffer = new byte[BUFFER_SIZE];
				while (in.read(buffer) > 0) {
					out.write(buffer);
				}
			} finally {
				if (null != in) {
					in.close();
				}
				if (null != out) {
					out.close();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static String getExtention(String fileName) {
		int pos = fileName.lastIndexOf(".");
		return fileName.substring(pos);
	}

	@Override
	public String execute() {
		if (StringUtils.isEmpty(myFileFileName) || null == myFile
				|| StringUtils.isEmpty(caption)) {
			return SUCCESS;
		}
		imageFileName = new Date().getTime() + getExtention(myFileFileName);
		File imageFile = new File(ServletActionContext.getServletContext()
				.getRealPath("/uploadFile") + "/" + imageFileName);
		copy(myFile, imageFile);
		return SUCCESS;
	}
}
