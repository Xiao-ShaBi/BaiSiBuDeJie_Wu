package com.wzf.basibudejie_wu.bean;

import java.util.List;

/**
 * 联网获得的，tab的bean，其中包涵了每个tab联网的数据
 */

public class TabBean {


    /**
     * menus : [{"name":"精华","submenus":[{"name":"推荐","god_topic_type":"nan","url":"http://s.budejie.com/topic/list/jingxuan/1/","recsys_url":"","type":"topic","entrytype":"self.koushu.android.feed.16081610415837"},{"name":"视频","god_topic_type":"nan","url":"http://s.budejie.com/topic/list/jingxuan/41/","recsys_url":"http://d.api.budejie.com/topic/list/chuanyue/41/","type":"topic","entrytype":"self.koushu.android.feed.16081610415837"},{"name":"图片","god_topic_type":"nan","url":"http://s.budejie.com/topic/list/jingxuan/10/","recsys_url":"http://d.api.budejie.com/topic/list/chuanyue/10/","type":"topic","entrytype":"self.koushu.android.feed.16081610415837"},{"name":"段子","god_topic_type":"nan","url":"http://s.budejie.com/topic/tag-topic/64/hot/","recsys_url":"http://d.api.budejie.com/topic/list/chuanyue/29/","type":"topic","entrytype":"self.koushu.android.feed.16081610415837"},{"name":"原创","god_topic_type":"nan","url":"http://s.budejie.com/topic/tag-topic/44289/hot/","recsys_url":"","type":"topic","entrytype":"self.koushu.android.feed.16081610415837"},{"name":"网红","god_topic_type":"nan","url":"http://s.budejie.com/topic/tag-topic/3096/hot/","recsys_url":"","type":"topic","entrytype":"self.koushu.android.feed.16081610415837"},{"name":"排行","god_topic_type":"nan","url":"http://s.budejie.com/topic/list/remen/1/","recsys_url":"","type":"topic","entrytype":"self.koushu.android.feed.16081610415837"},{"name":"社会","god_topic_type":"nan","url":"http://s.budejie.com/topic/tag-topic/473/hot/","recsys_url":"","type":"topic","entrytype":"self.koushu.android.feed.16081610415837"},{"name":"美女","god_topic_type":"nan","url":"http://s.budejie.com/topic/tag-topic/117/hot/","recsys_url":"","type":"topic","entrytype":"self.koushu.android.feed.16081610415837"},{"name":"冷知识","god_topic_type":"nan","url":"http://s.budejie.com/topic/tag-topic/3176/hot/","recsys_url":"","type":"topic","entrytype":"self.koushu.android.feed.16081610415837"},{"name":"游戏","god_topic_type":"nan","url":"http://s.budejie.com/topic/tag-topic/164/hot/","recsys_url":"","type":"topic","entrytype":"self.koushu.android.feed.16081610415837"}]},{"name":"新帖","submenus":[{"name":"全部","god_topic_type":"nan","url":"http://s.budejie.com/topic/list/zuixin/1/","recsys_url":"http://d.api.budejie.com/topic-recsys/audit-topic/1/","type":"topic","entrytype":"self.koushu.android.feed.16081610415837"},{"name":"视频","god_topic_type":"nan","url":"http://s.budejie.com/topic/list/zuixin/41/","recsys_url":"http://d.api.budejie.com/topic-recsys/audit-topic/41/","type":"topic","entrytype":"self.koushu.android.feed.16081610415837"},{"name":"图片","god_topic_type":"nan","url":"http://s.budejie.com/topic/list/zuixin/10/","recsys_url":"http://d.api.budejie.com/topic-recsys/audit-topic/10/","type":"topic","entrytype":"self.koushu.android.feed.16081610415837"},{"name":"段子","god_topic_type":"nan","url":"http://s.budejie.com/topic/list/zuixin/29/","recsys_url":"http://d.api.budejie.com/topic-recsys/audit-topic/29/","type":"topic","entrytype":"self.koushu.android.feed.16081610415837"},{"name":"原创","god_topic_type":"nan","url":"http://s.budejie.com/topic/tag-topic/44289/new/","recsys_url":"","type":"topic","entrytype":"self.koushu.android.feed.16081610415837"},{"name":"网红","god_topic_type":"nan","url":"http://s.budejie.com/topic/tag-topic/3096/new/","recsys_url":"","type":"topic","entrytype":"self.koushu.android.feed.16081610415837"},{"name":"美女","god_topic_type":"nan","url":"http://s.budejie.com/topic/tag-topic/117/new/","recsys_url":"","type":"topic","entrytype":"self.koushu.android.feed.16081610415837"},{"name":"冷知识","god_topic_type":"nan","url":"http://s.budejie.com/topic/tag-topic/3176/new/","recsys_url":"","type":"topic","entrytype":"self.koushu.android.feed.16081610415837"},{"name":"声音","god_topic_type":"nan","url":"http://s.budejie.com/topic/list/zuixin/31/","recsys_url":"","type":"topic","entrytype":"self.koushu.android.feed.16081610415837"},{"name":"游戏","god_topic_type":"nan","url":"http://s.budejie.com/topic/tag-topic/164/new/","recsys_url":"","type":"topic","entrytype":"self.koushu.android.feed.16081610415837"}]}]
     * default_menu : {"offline_day_3":"0_0","initial":"0_0","offline_day_7":"0_0"}
     */

    private DefaultMenuBean default_menu;
    private List<MenusBean> menus;

    public DefaultMenuBean getDefault_menu() {
        return default_menu;
    }

    public void setDefault_menu(DefaultMenuBean default_menu) {
        this.default_menu = default_menu;
    }

    public List<MenusBean> getMenus() {
        return menus;
    }

    public void setMenus(List<MenusBean> menus) {
        this.menus = menus;
    }

    public static class DefaultMenuBean {
        /**
         * offline_day_3 : 0_0
         * initial : 0_0
         * offline_day_7 : 0_0
         */

        private String offline_day_3;
        private String initial;
        private String offline_day_7;

        public String getOffline_day_3() {
            return offline_day_3;
        }

        public void setOffline_day_3(String offline_day_3) {
            this.offline_day_3 = offline_day_3;
        }

        public String getInitial() {
            return initial;
        }

        public void setInitial(String initial) {
            this.initial = initial;
        }

        public String getOffline_day_7() {
            return offline_day_7;
        }

        public void setOffline_day_7(String offline_day_7) {
            this.offline_day_7 = offline_day_7;
        }
    }

    public static class MenusBean {
        /**
         * name : 精华
         * submenus : [{"name":"推荐","god_topic_type":"nan","url":"http://s.budejie.com/topic/list/jingxuan/1/","recsys_url":"","type":"topic","entrytype":"self.koushu.android.feed.16081610415837"},{"name":"视频","god_topic_type":"nan","url":"http://s.budejie.com/topic/list/jingxuan/41/","recsys_url":"http://d.api.budejie.com/topic/list/chuanyue/41/","type":"topic","entrytype":"self.koushu.android.feed.16081610415837"},{"name":"图片","god_topic_type":"nan","url":"http://s.budejie.com/topic/list/jingxuan/10/","recsys_url":"http://d.api.budejie.com/topic/list/chuanyue/10/","type":"topic","entrytype":"self.koushu.android.feed.16081610415837"},{"name":"段子","god_topic_type":"nan","url":"http://s.budejie.com/topic/tag-topic/64/hot/","recsys_url":"http://d.api.budejie.com/topic/list/chuanyue/29/","type":"topic","entrytype":"self.koushu.android.feed.16081610415837"},{"name":"原创","god_topic_type":"nan","url":"http://s.budejie.com/topic/tag-topic/44289/hot/","recsys_url":"","type":"topic","entrytype":"self.koushu.android.feed.16081610415837"},{"name":"网红","god_topic_type":"nan","url":"http://s.budejie.com/topic/tag-topic/3096/hot/","recsys_url":"","type":"topic","entrytype":"self.koushu.android.feed.16081610415837"},{"name":"排行","god_topic_type":"nan","url":"http://s.budejie.com/topic/list/remen/1/","recsys_url":"","type":"topic","entrytype":"self.koushu.android.feed.16081610415837"},{"name":"社会","god_topic_type":"nan","url":"http://s.budejie.com/topic/tag-topic/473/hot/","recsys_url":"","type":"topic","entrytype":"self.koushu.android.feed.16081610415837"},{"name":"美女","god_topic_type":"nan","url":"http://s.budejie.com/topic/tag-topic/117/hot/","recsys_url":"","type":"topic","entrytype":"self.koushu.android.feed.16081610415837"},{"name":"冷知识","god_topic_type":"nan","url":"http://s.budejie.com/topic/tag-topic/3176/hot/","recsys_url":"","type":"topic","entrytype":"self.koushu.android.feed.16081610415837"},{"name":"游戏","god_topic_type":"nan","url":"http://s.budejie.com/topic/tag-topic/164/hot/","recsys_url":"","type":"topic","entrytype":"self.koushu.android.feed.16081610415837"}]
         */

        private String name;
        private List<SubmenusBean> submenus;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<SubmenusBean> getSubmenus() {
            return submenus;
        }

        public void setSubmenus(List<SubmenusBean> submenus) {
            this.submenus = submenus;
        }

        public static class SubmenusBean {
            /**
             * name : 推荐
             * god_topic_type : nan
             * url : http://s.budejie.com/topic/list/jingxuan/1/
             * recsys_url :
             * type : topic
             * entrytype : self.koushu.android.feed.16081610415837
             */

            private String name;
            private String god_topic_type;
            private String url;
            private String recsys_url;
            private String type;
            private String entrytype;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getGod_topic_type() {
                return god_topic_type;
            }

            public void setGod_topic_type(String god_topic_type) {
                this.god_topic_type = god_topic_type;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getRecsys_url() {
                return recsys_url;
            }

            public void setRecsys_url(String recsys_url) {
                this.recsys_url = recsys_url;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getEntrytype() {
                return entrytype;
            }

            public void setEntrytype(String entrytype) {
                this.entrytype = entrytype;
            }
        }
    }
}
