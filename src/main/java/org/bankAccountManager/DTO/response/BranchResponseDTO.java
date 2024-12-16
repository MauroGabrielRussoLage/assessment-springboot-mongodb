package org.bankAccountManager.DTO.response;

public class BranchResponseDTO {
    private int id;
    private String name;
    private String address;
    private String phone;

    public BranchResponseDTO(String address, int id, String name, String phone) {
        this.address = address;
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public BranchResponseDTO() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}