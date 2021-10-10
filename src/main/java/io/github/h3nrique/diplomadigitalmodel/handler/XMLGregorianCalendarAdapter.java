package br.com.fabricads.gov.handler;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class XMLGregorianCalendarAdapter extends XmlAdapter<String, XMLGregorianCalendar> {

    private static final String DATE_FORMAT = "yyyy-MM-dd";

    @Override
    public XMLGregorianCalendar unmarshal(String s) throws Exception {
        DateFormat format = new SimpleDateFormat(DATE_FORMAT);
        Date date = format.parse(s);
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);
        return  DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);

    }

    @Override
    public String marshal(XMLGregorianCalendar xmlGregorianCalendar) throws Exception {
        return new SimpleDateFormat(DATE_FORMAT).format(xmlGregorianCalendar.toGregorianCalendar().getTime());
    }
}
