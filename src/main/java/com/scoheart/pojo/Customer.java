package com.scoheart.pojo;

/**
 * @ProjectName: ScoheartPages
 * @ClassName: customer
 * @Description: TODO
 * @Author: Scoheart
 * @Date: 2022/11/9 20:28
 * @Version: 1.0
 **/
public  class Customer {
       private Integer  customerId;
       private String  username;
       private String  password;
       private String  customerName;
       private String  customerGender;
       private String  customerBirthday;
       private String  customerPhone;
       private String  customerEmail;
       private String  customerAddr;

        public Integer getCustomerId() {
            return customerId;
        }

        public void setCustomerId(Integer customerId) {
            this.customerId = customerId;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getCustomerName() {
            return customerName;
        }

        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }

        public String getCustomerGender() {
            return customerGender;
        }

        public void setCustomerGender(String customerGender) {
            this.customerGender = customerGender;
        }

        public String getCustomerBirthday() {
            return customerBirthday;
        }

        public void setCustomerBirthday(String customerBirthday) {
            this.customerBirthday = customerBirthday;
        }

        public String getCustomerPhone() {
            return customerPhone;
        }

        public void setCustomerPhone(String customerPhone) {
            this.customerPhone = customerPhone;
        }

        public String getCustomerEmail() {
            return customerEmail;
        }

        public void setCustomerEmail(String customerEmail) {
            this.customerEmail = customerEmail;
        }

        public String getCustomerAddr() {
            return customerAddr;
        }

        public void setCustomerAddr(String customerAddr) {
            this.customerAddr = customerAddr;
        }

        @Override
        public String toString() {
            return "customer{" +
                    "customerId=" + customerId +
                    ", username='" + username + '\'' +
                    ", password='" + password + '\'' +
                    ", customerName='" + customerName + '\'' +
                    ", customerGender='" + customerGender + '\'' +
                    ", customerBirthday='" + customerBirthday + '\'' +
                    ", customerPhone='" + customerPhone + '\'' +
                    ", customerEmail='" + customerEmail + '\'' +
                    ", customerAddr='" + customerAddr + '\'' +
                    '}';
        }
}

