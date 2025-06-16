import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamPagination {
    public static void main(String[] args) {
        List<Integer> data = IntStream.rangeClosed(1, 100)
                                      .boxed()
                                      .collect(Collectors.toList());

        int pageNumber = 3; 
        int pageSize = 10;  

        List<Integer> paginatedData = paginate(data, pageNumber, pageSize);

        System.out.println("Page " + pageNumber + ": " + paginatedData);
    }

    public static <T> List<T> paginate(List<T> data, int pageNumber, int pageSize) {
        return data.stream()
                   .skip((long) (pageNumber - 1) * pageSize) 
                   .limit(pageSize)
                   .collect(Collectors.toList());
    }
}
