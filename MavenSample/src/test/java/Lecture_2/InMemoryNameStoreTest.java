package Lecture_2;


import org.junit.jupiter.api.Test;
import  static  org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class InMemoryNameStoreTest {

    @Test
    public void should_returnEmptyNames_when_Create() {
        InMemoryNameStore store = new InMemoryNameStore();
        assertThat(store.getNames(),is(empty()));

    }

    @Test
    public void should_Return_name_when_name_isgiven() {
        InMemoryNameStore store = new InMemoryNameStore();
        store.store("Kamal");
        assertThat(store.getNames(),hasSize(1));
    }

    @Test
    public void should_get_name_when_name_is_available() {
        InMemoryNameStore store = new InMemoryNameStore();
        store.store("kamal");
        assertThat(store.getNames(),contains("kamal"));
    }

    @Test
    void should_return_all_names_when_storeHasMoreNames() {
        InMemoryNameStore store = new InMemoryNameStore();
        store.store("kamal");
        store.store("nimal");
        assertThat(store.getNames(), containsInAnyOrder("kamal","nimal"));
    }
}


// why test is not auto generatod when i press test
