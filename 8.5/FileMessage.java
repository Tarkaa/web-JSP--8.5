package mybean.data;

public class FileMessage { 
    private String filePath; 
    private String fileName; 
    private String fileContent; 
    private long fileLength; 
    public String getFilePath() { 
        return filePath; 
    } 
    public void setFilePath(String filePath) { 
        this.filePath = filePath; 
    } 
    public String getFileName() { 
        return fileName; 
    } 
    public void setFileName(String fileName) { 
        this.fileName = fileName; 
    } 
    public String getFileContent() { 
        return fileContent; 
    } 
    public void setFileContent(String fileContent) { 
        this.fileContent = fileContent; 
    } 
    public long getFileLength() { 
        return fileLength; 
    } 
    public void setFileLength(long fileLength) { 
        this.fileLength = fileLength; 
    } 
     
} 
