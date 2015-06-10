/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author robertwaters
 */
class UserData {
    private String id;
    private String password;
    private String name;
    private String email;
    private String address;
    
    public String getName() {
        return name;
    }
    
    UserData(String d, String ps, String nm) {
        id = d;
        password = ps;
        name = nm;
    }
    
    boolean checkLogin(String p) {
        return p.equals(password);
    }
    
}
