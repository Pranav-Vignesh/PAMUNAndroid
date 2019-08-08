package com.vigneshpranav.pamun;

public class Committee {

    private String committee;
    private String issue1;
    private String issue2;

    public Committee(String committee, String issue1, String issue2) {
        this.committee = committee;
        this.issue1 = issue1;
        this.issue2 = issue2;
    }

    public String getCommittee() {
        return committee;
    }

    public void setCommittee(String committee) {
        this.committee = committee;
    }

    public String getIssue1() {
        return issue1;
    }

    public void setIssue1(String issue1) {
        this.issue1 = issue1;
    }

    public String getIssue2() {
        return issue2;
    }

    public void setIssue2(String issue2) {
        this.issue2 = issue2;
    }

}
