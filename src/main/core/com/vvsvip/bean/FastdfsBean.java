package com.vvsvip.bean;

/**
 * Fastdfs上传反馈信息
 * Created by blues on 2017/4/23.
 */
public class FastdfsResult {
    /**
     * 组名
     */
    private String groupName;
    /**
     * 远程文件
     */
    private String remoteFile;


    public FastdfsResult() {
    }

    public FastdfsResult(String[] result) {
        this.groupName = result[0];
        this.remoteFile = result[1];
    }


    public FastdfsResult(String groupName, String remoteFile) {
        this.groupName = groupName;
        this.remoteFile = remoteFile;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getRemoteFile() {
        return remoteFile;
    }

    public void setRemoteFile(String remoteFile) {
        this.remoteFile = remoteFile;
    }
}
