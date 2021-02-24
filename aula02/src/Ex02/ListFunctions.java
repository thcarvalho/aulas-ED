package Ex02;

import javax.swing.*;

public class ListFunctions {
  static String verifyList(List list) {
    if (list.data.length == list.length) {
      return "full";
    } else if (list.length == 0) {
      return "empty";
    } else {
      return "free";
    }
  }

  static List addStringOnBeginning(List list, String element) {
    if (list.length < list.data.length) {
      for (int i = list.length; i > 0; i--) {
        list.data[i] = list.data[i - 1];
      }
      list.data[0] = element;
      list.length++;
    } else {
      JOptionPane.showMessageDialog(null, "Lista cheia");
    }
    return list;
  }

  static List addStringOnEnd(List list, String element) {
    if (list.length < list.data.length) {
      list.data[list.length] = element;
      list.length++;
    } else {
      JOptionPane.showMessageDialog(null, "Lista cheia");
    }
    return list;
  }

  static List addStringOnPosition(List list, String element, int position) {
    if ((list.length < list.data.length) && (position < list.length) && (position >= 0)) {
      int i ;
      for (i = list.length; i != position; i--) {
        list.data[i] = list.data[i - 1];
      }
      list.data[i] = element;
      list.length++;
    } else {
      JOptionPane.showMessageDialog(null, "Lista cheia");
    }

    return list;
  }

  static List removeStringOnBeginning(List list) {
    if (list.length >= 1) {
      String response = list.data[0];

      for (int i = 1; i < list.data.length; i++) {
        list.data[i - 1] = list.data[i];
      }

      list.length--;

      JOptionPane.showMessageDialog(null, response);
    } else {
      JOptionPane.showMessageDialog(null, "Lista vazia");
    }
    return list;
  }

  static List removeStringOnEnd(List list) {
    if (list.length >= 1) {
      String response = list.data[list.length - 1];

      list.length--;

      JOptionPane.showMessageDialog(null, response);
    } else {
      JOptionPane.showMessageDialog(null, "Lista vazia");
    }
    return list;
  }

  static List removeStringOnPosition(List list, int position) {
    if ((position < list.length) && (position >= 0) && (list.length >= 1)) {
      String response = list.data[position];

      list.length--;
      for (int i = position; i < list.length; i++) {
        list.data[i] = list.data[i + 1];
      }

      JOptionPane.showMessageDialog(null, response);
    } else {
      JOptionPane.showMessageDialog(null, "Lista vazia");
    }
    return list;
  }

  static String mapList(List list) {
    String response = "";

    for (int i = 0; i < list.length; i++) {
      response=response+"\n"+list.data[i];
    }

    return response;
  }

}
