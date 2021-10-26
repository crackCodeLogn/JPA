package org.example.jpa.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author Vivek
 * @since 24/10/21
 */
@Entity
@Table(name = "experi")
public class UserEntity implements Serializable {
    private static final long serialVersionUID = -3876784591524546724L;

    @Id
    @Column(name = "email")
    private String email;

    @Column(name = "name_first")
    private String firstName;

    @Column(name = "name_last")
    private String lastName;

    @Column(name = "mobile")
    private long mobile;

    public UserEntity() {
    }

    public UserEntity(String email, String firstName, String lastName, long mobile) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.JSON_STYLE)
                .append("email", email)
                .append("firstName", firstName)
                .append("lastName", lastName)
                .append("mobile", mobile)
                .toString();
    }

    public String getEmail() {
        return email;
    }

    public UserEntity setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public UserEntity setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserEntity setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public long getMobile() {
        return mobile;
    }

    public UserEntity setMobile(long mobile) {
        this.mobile = mobile;
        return this;
    }
}