package model.Bean;

public class FileUpload {
	private String name;
	private String path;
	private String uploader;
	private String status;

	public FileUpload() {
	}

	public FileUpload(String name, String path, String uploader, String status) {
		this.name = name;
		this.path = path;
		this.uploader = uploader;
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getUploader() {
		return uploader;
	}

	public void setUploader(String uploader) {
		this.uploader = uploader;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
