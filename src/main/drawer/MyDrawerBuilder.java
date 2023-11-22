package main.drawer;


import csynch.form.ChatForm;
import csynch.tabbed.WindowsTabbed;
import raven.drawer.component.SimpleDrawerBuilder;
import raven.drawer.component.footer.SimpleFooterData;
import raven.drawer.component.header.SimpleHeaderData;
import raven.drawer.component.menu.MenuAction;
import raven.drawer.component.menu.MenuEvent;
import raven.drawer.component.menu.MenuValidation;
import raven.drawer.component.menu.SimpleMenuOption;
import raven.swing.AvatarIcon;



public class MyDrawerBuilder extends SimpleDrawerBuilder {
    @Override
    public SimpleHeaderData getSimpleHeaderData() {
        return new SimpleHeaderData()
                .setIcon(new AvatarIcon(getClass().getResource("/csynch/images/ball.png"), 60, 60, 999))
                .setTitle("@hyein_newjeans")
                .setDescription("newjeans hyein");
    }

    @Override
    public SimpleMenuOption getSimpleMenuOption() {
        
        String menus[][] = {
            {"~Menu~"},
            
            {"Dashboard"},
            
            {"~Profile~"},
            
            {"Courses"},
            {"Calendar"},
            {"Logout"},
        };

        String icons[] = {
            "dashboard.svg",
            "chat.svg",
            "calendar.svg",
            "logout.svg",
        };

        return new SimpleMenuOption()
                .setMenus(menus)
                .setIcons(icons)
                .setBaseIconPath("drawer/icons")
                .setIconScale(0.28f)
                .addMenuEvent(new MenuEvent() {
                    @Override
                    public void selected(MenuAction action, int index, int subIndex) {
                        if(index ==0){
                            WindowsTabbed.getInstance().addTab("Chat Form", new ChatForm());
                        }
                        System.out.println("Menu selected " + index + " " + subIndex);
                    }
                })
                .setMenuValidation(new MenuValidation() {
                    @Override
                    public boolean menuValidation(int index, int subIndex) {
//                        if(index==0){
//                            return false;
//                        }else if(index==3){
//                            return false;
//                        }
                        return true;
                    }
                    
     
               });
    }

    @Override
    public SimpleFooterData getSimpleFooterData() {
        return new SimpleFooterData()
                .setTitle("Hello!")
                .setDescription("Need help? Visit csynch.edu.net");
    }
}
