// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;
// import java.net.HttpURLConnection;
// import java.net.URL;
// import java.net.URLEncoder;

// public class FoodSafetyApiExample {
//     public static void main(String[] args) throws IOException {
//         // API 키 입력 (이 부분에 자신의 API 키를 넣어야 함)
//         String serviceKey = "286a3e3b38cf4050b678"; 
        
//         // API URL
//         String apiUrl = "https://www.foodsafetykorea.go.kr/api/openApiInfo.do";
        
//         // URL 파라미터 구성
//         String params = "?menu_grp=MENU_GRP31&menu_no=661&show_cnt=10&start_idx=1&svc_no=C003";
//         params += "&" + URLEncoder.encode("serviceKey", "UTF-8") + "=" + URLEncoder.encode(serviceKey, "UTF-8"); // API 키 포함
        
//         // 최종 URL 만들기
//         URL url = new URL(apiUrl + params);
        
//         // 연결 설정
//         HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//         connection.setRequestMethod("GET");
        
//         // 응답 코드 확인
//         int responseCode = connection.getResponseCode();
//         System.out.println("Response Code: " + responseCode);
        
//         // 응답 데이터 읽기
//         BufferedReader reader;
//         if (responseCode >= 200 && responseCode <= 300) {
//             reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
//         } else {
//             reader = new BufferedReader(new InputStreamReader(connection.getErrorStream(), "UTF-8"));
//         }
        
//         StringBuilder response = new StringBuilder();
//         String line;
//         while ((line = reader.readLine()) != null) {
//             response.append(line);
//         }
        
//         // 스트림 종료
//         reader.close();
//         connection.disconnect();
        
//         // 응답 내용 출력 (예시: JSON 형식으로 받아서 출력)
//         System.out.println("API Response: ");
//         System.out.println(response.toString());
//     }
// }


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class FoodSafetyApiExample {
    public static void main(String[] args) throws IOException {
        // API 키 입력 (여기에 자신의 API 키를 넣어야 함)
        String serviceKey = "286a3e3b38cf4050b678"; // 본인의 API 키로 변경

        // 품목명을 입력받을 수 있도록 추가
        String itemName = "비타민";  // 예: "아스피린" (검색하고 싶은 품목명을 입력)
        
        // API URL
        String apiUrl = "https://www.foodsafetykorea.go.kr/api/openApiInfo.do";
        
        // URL 파라미터 구성
        String params = "?menu_grp=MENU_GRP31&menu_no=661&show_cnt=10&start_idx=1&svc_no=C003";
        params += "&" + URLEncoder.encode("serviceKey", "UTF-8") + "=" + URLEncoder.encode(serviceKey, "UTF-8"); // API 키 포함
        params += "&" + URLEncoder.encode("itemName", "UTF-8") + "=" + URLEncoder.encode(itemName, "UTF-8"); // 품목명으로 검색
        
        // 최종 URL 만들기
        URL url = new URL(apiUrl + params);
        
        // 연결 설정
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        
        // 응답 코드 확인
        int responseCode = connection.getResponseCode();
        System.out.println("Response Code: " + responseCode);
        
        // 응답 데이터 읽기
        BufferedReader reader;
        if (responseCode >= 200 && responseCode <= 300) {
            reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
        } else {
            reader = new BufferedReader(new InputStreamReader(connection.getErrorStream(), "UTF-8"));
        }
        
        StringBuilder response = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            response.append(line);
        }
        
        // 스트림 종료
        reader.close();
        connection.disconnect();
        
        // XML 파싱 시작
        try {
            // XML 응답 파싱
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new InputSource(new StringReader(response.toString())));
            document.getDocumentElement().normalize();
            
            // XML에서 품목명 정보 추출
            NodeList nodeList = document.getElementsByTagName("itemName"); // 품목명 태그
            if (nodeList.getLength() == 0) {
                System.out.println("품목명이 없습니다. 확인해 주세요.");
            } else {
                System.out.println("품목명 검색 결과:");
                for (int i = 0; i < nodeList.getLength(); i++) {
                    Node node = nodeList.item(i);
                    if (node.getNodeType() == Node.ELEMENT_NODE) {
                        Element element = (Element) node;
                        String item = element.getTextContent();
                        System.out.println("품목명: " + item);
                    }
                }
            }
            
            // 예쁘게 출력하려면 여기에 추가적으로 HTML 혹은 JSON 파싱 처리가 필요할 수 있음
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
