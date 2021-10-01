package zk.gradle.vm;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.*;

import java.util.Arrays;
import java.util.List;

public class ProfileViewController extends SelectorComposer<Component> {

    //wire components
    @Wire
    Label account;
    @Wire
    Textbox fullName;
    @Wire
    Textbox email;
    @Wire
    Datebox birthday;
    @Wire
    Listbox country;
    @Wire
    Textbox bio;

    @Override
    public void doAfterCompose(Component comp) throws Exception{
        super.doAfterCompose(comp);

        ListModelList<String> countryModel = new ListModelList<String>(getCountryList());
        country.setModel(countryModel);
        email.setText("aaaa");
        refreshProfileView();
    }

    private void refreshProfileView() {

    }

    private List<String> getCountryList() {
        return Arrays.asList("Viet Nam", "US");
    }


}