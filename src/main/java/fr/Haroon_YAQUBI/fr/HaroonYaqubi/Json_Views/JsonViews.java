package fr.Haroon_YAQUBI.fr.HaroonYaqubi.Json_Views;

public class JsonViews {

        public interface UserMinimalView { }


        public interface RegionListView extends UserMinimalView { }

        public interface RegionShowView extends UserMinimalView { }


        public interface DepartmentListView { }


        public interface DepartmentShowView extends DepartmentListView, RegionListView { }

    }

