package isp.lab9.exercise3;

import isp.lab9.exercise3.exceptions.TenantAlreadyExistsException;

public class Main {
    public static void main(String[] args) {
        final DoorLockController doorLockController=new DoorLockController();
        //Add tenants and some exception
        try {
            doorLockController.addTenant("1234", "Kevin");
            doorLockController.addTenant("1122", "Jack");
            doorLockController.addTenant("1010", "Jack");
        } catch (TenantAlreadyExistsException e) {
            System.out.println("Error: Tenant with same name cannot be added");
        } finally {
            try {
                doorLockController.addTenant("9081", "Anderson");
                doorLockController.addTenant("9081", "Eva");
            } catch (TenantAlreadyExistsException e) {
                System.out.println("Error: Tenant with same name cannot be added");
            }
        }

        InterfaceGraphics interfaceGraphics = new InterfaceGraphics(doorLockController);
        interfaceGraphics.setVisible(true);
    }
}
