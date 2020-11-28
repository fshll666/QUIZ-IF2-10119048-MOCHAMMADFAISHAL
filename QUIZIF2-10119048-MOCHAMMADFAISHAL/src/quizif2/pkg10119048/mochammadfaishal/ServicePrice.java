/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizif2.pkg10119048.mochammadfaishal;

/**
 *
 * @author SystemOs
 * Nama      : Mochammad Faishal
 * NIM       : 10119048
 * Kelas     : IF2
 */
public class ServicePrice extends ServiceItem{
    float priceService,discount;

    public float getPriceService() {
        return priceService;
    }

    public void setPriceService(float priceService) {
        this.priceService = priceService;
    }
    
    

    @Override
    public void displayService() {
        System.out.println("#*************************#");
        System.out.println("#***Rock n Roll Haircut***#");
        System.out.println("#*******Service List******#");
        System.out.println("1. Haircut : IDR 45K");
        System.out.println("2. Haircut + Hairwash: IDR 55K");
        System.out.println("3. Hairwash Only : IDR 15K");
        System.out.println("#*************************#");
        System.out.println("Choose (1/2/3):");
    }

    @Override
    public float getPrice(int serviceItem) {
        switch (serviceItem){
            case 1:
                priceService = 45000;
                break;
            case 2:
                priceService = 55000;
                break;
            case 3:
                priceService = 15000;
                break;
            default:
                break;
        }
        return priceService;
                
        
    }

    @Override
    public boolean checkMemberStatus(String statusMember) {
        boolean status;
        status = "Yes".equals(statusMember)|| "yes".equals(statusMember);
        return status;
    }

    @Override
    public float getSale(boolean isMember, float parServicePrice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public float getTotalPay(float priceService,float discount){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}