package ru.home.tablegamesshop.ui;

import ru.home.tablegamesshop.datasource.DataSource;
import ru.home.tablegamesshop.datasource.DataSourceImpl;
import ru.home.tablegamesshop.repository.Repository;
import ru.home.tablegamesshop.repository.RepositoryImpl;

public class Main {
    public static void main(String[] args) {
        DataSource dataSource = new DataSourceImpl();
        Repository repository = new RepositoryImpl(dataSource);
        Adapter adapter = new Adapter(repository,dataSource);
        adapter.show();


    }
}

