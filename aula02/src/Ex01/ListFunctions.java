package Ex01;

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

  static List addCharOnBeginning(List list, char element) {
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

  static List addCharOnEnd(List list, char element) {
    if (list.length < list.data.length) {
      list.data[list.length] = element;
      list.length++;
    } else {
      JOptionPane.showMessageDialog(null, "Lista cheia");
    }
    return list;
  }

  static List addCharOnPosition(List list, char element, int position) {
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

  static List removeCharOnBeginning(List list) {
    if (list.length >= 1) {
      char response = list.data[0];

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

  static List removeCharOnEnd(List list) {
    if (list.length >= 1) {
      char response = list.data[list.length - 1];

      list.length--;

      JOptionPane.showMessageDialog(null, response);
    } else {
      JOptionPane.showMessageDialog(null, "Lista vazia");
    }
    return list;
  }

  static List removeCharOnPosition(List list, int position) {
    if ((position < list.length) && (position >= 0) && (list.length >= 1)) {
      char response = list.data[position];

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
