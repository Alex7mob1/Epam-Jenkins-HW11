package rozetka.steps;

import rozetka.pages.panel.SearchPanel;

public class SearchPanelBL {

    private SearchPanel searchPanel;

    public SearchPanelBL() {
        searchPanel = new SearchPanel();
    }

    public ProductTypePageBL searchElement(String type) {
        searchPanel.inputTextInSearchBox(type);
        searchPanel.clickOnSearchButton();
        return new ProductTypePageBL();
    }
}