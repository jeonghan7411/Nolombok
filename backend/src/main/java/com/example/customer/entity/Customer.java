package com.example.customer.entity;

import jakarta.persistence.*;



//Dto
//클래스 위에 @Entity 설정
//클래스 위에 Table 이름 명시
//JPA : 필드명과 디비의 컬럼명을 매칭

@Entity
@Table(name="customer")
public class Customer {  //객체 + 저장 + 메모리 초기화(생성자) = 하나씩 처리 보다는 한번에
    //멤버변수 = 필드

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @Column(name="username")
    private String username;
    @Column(name="passwd")
    private String passwd;
    @Column(name="email")
    private String email;
    @Column(name="address")
    private String address;
    @Column(name="contact")
    private String contact;


    //생성자 : 디폴트 생성자 하나만 있으면 생략 가능
    public Customer(){} //Default Constructor

    //getter,setter   alt + shift 단축키 누르면 한번에 생성 가능함

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
        //멤버변수  = 매개변수
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }


    //debuggin : toString();

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", passwd='" + passwd + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}
