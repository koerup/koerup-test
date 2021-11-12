package koerup.test.views.wordmap;

import com.vaadin.flow.component.template.Id;
import koerup.test.components.leafletmap.LeafletMap;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import koerup.test.views.MainLayout;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;

@PageTitle("Word Map")
@Route(value = "Map", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
@Tag("word-map-view")
@JsModule("./views/wordmap/word-map-view.ts")
public class WordMapView extends LitTemplate implements HasSize {

    @Id("theMap")
    private LeafletMap map;

    public WordMapView() {
        setSizeFull();
        map.setView(55.0, 10.0, 4);
    }
}
