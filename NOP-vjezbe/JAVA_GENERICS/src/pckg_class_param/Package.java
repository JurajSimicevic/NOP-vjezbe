package pckg_class_param;

import java.util.ArrayList;

public class Package <T> {

    private final ArrayList<T> pckgContent;

    // private final ArrayList<T> pckgContent; // - final reference ArrayList, za razliku od final primitivnih podataka
    private Class<T> classType;

    public Package(Class<T> type) {
        this.classType = type;
        this.pckgContent = new ArrayList();
        System.out.println("Created package: " + classType);
    }

//    public void setPckgContent(ArrayList<T> contentNew) {
//        this.pckgContent = contentNew;
//    }


    public void addNewElementToPackage(T pckgElement) {
        if (pckgContent.contains(pckgElement)) {
            System.out.println("Element already exists in package.");
        } else {
            pckgContent.add(pckgElement);
            System.out.println("Added new element to package.");
        }
    }

    public void listPackageContent() { // ne treba parametar jer je pckgContent atribut klase
        if (pckgContent.isEmpty()) {
            System.out.println("Package is empty.");
        } else {
            for (T conEl : pckgContent) {
                System.out.println(conEl);
            }
        }
    }
}
