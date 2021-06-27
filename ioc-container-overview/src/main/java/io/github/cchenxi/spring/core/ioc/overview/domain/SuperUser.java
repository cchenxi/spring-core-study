package io.github.cchenxi.spring.core.ioc.overview.domain;

import io.github.cchenxi.spring.core.ioc.overview.annotation.Super;

/**
 * 超级用户
 * Date: 2021-06-27
 *
 * @author chenxi
 */
@Super
public class SuperUser extends User {
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "SuperUser{" +
                "address='" + address + '\'' +
                "} " + super.toString();
    }
}
