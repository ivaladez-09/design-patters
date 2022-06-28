package factory;

public class BeefBurger implements Burger {
    private Integer productId;
    private String addOns;
    private boolean angus;

    @Override
    public void prepare() {

    }

    public boolean isAngus() {
        return angus;
    }

    public void setAngus(boolean angus) {
        this.angus = angus;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getAddOns() {
        return addOns;
    }

    public void setAddOns(String addOns) {
        this.addOns = addOns;
    }
}
