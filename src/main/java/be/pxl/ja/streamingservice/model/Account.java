package be.pxl.ja.streamingservice.model;

import java.util.List;

public class Account {
    private String email;
    private String password;
    private PaymentInfo paymentInfo;
    private StreamingPlan streamingPlan;
    private List<Profile> profiles;

    public Account(String email, String password) {
        this.email = email;
        this.password = password;
        Profile profile = new Profile("profile1");

    }

    public Profile getFirstProfile() {
        return profiles.get(0);
    }

    public String getEmail() {
        return email;
    }
    public void addProfile(Profile profile) {
        profiles.add(profile);
    }
    public boolean verifyPassword(String password) {
        return true;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPaymentInfo(PaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    public void setStreamingPlan(StreamingPlan streamingPlan) {
        this.streamingPlan = streamingPlan;
    }
}
