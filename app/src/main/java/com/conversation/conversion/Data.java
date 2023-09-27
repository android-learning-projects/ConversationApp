package com.conversation.conversion;

public class Data {
    private String type;
    private String paymentStatus;

    public Data(String type, String paymentStatus) {
        this.type = type;
        this.paymentStatus = paymentStatus;
    }

    @Override
    public String toString() {
        return "Data{" +
                "type='" + type + '\'' +
                ", paymentStatus='" + paymentStatus + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
