import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by aze on 2017.04.04..
 */
class ExtensionTest {

  Extension extension = new Extension();

  @Test
  void testAdd_2and3is5() {
    assertEquals(5, extension.add(2, 3));
  }

  @Test
  void testAdd_1and4is5() {
    assertEquals(5, extension.add(1, 4));
  }

  @Test
  void testAdd_to6() {
    assertEquals(6, extension.add(1, 5));
  }

  @Test
  void testMaxOfThree_first() {
    assertEquals(5, extension.maxOfThree(5, 4, 3));
  }

  @Test
  void testMaxOfThree_third() {
    assertEquals(5, extension.maxOfThree(3, 4, 5));
  }

  @Test
  void testMaxOfThree_fourth() {
    assertEquals(4, extension.maxOfThree(3, 4, 2));
  }

  @Test
  void testMedian_four() {
    assertEquals(4, extension.median(Arrays.asList(7,5,3,5)));
  }

  @Test
  void testMedian_five() {
    assertEquals(3, extension.median(Arrays.asList(1,2,3,4,5)));
  }

  @Test
  void testMedian_six() {
    assertEquals(3.5, extension.median(Arrays.asList(1,2,3,4,5,6)));
  }

  @Test
  void testIsVowel_a() {
    assertTrue(extension.isVowel('a'));
  }

  @Test
  void testIsVowel_u() {
    assertTrue(extension.isVowel('u'));
  }

  @Test
  void testIsVowel_A() {
    assertTrue(extension.isVowel('A'));
  }

  @Test
  void testTranslate_bemutatkozik() {
    assertEquals("bevemuvutavatkovozivik", extension.translate("bemutatkozik"));
  }

  @Test
  void testTranslate_lagopus() {
    assertEquals("lavagovopuvus", extension.translate("lagopus"));
  }

  @Test
  void testTranslate_lagopus2() {
    assertEquals("lAvAgovopUvUS", extension.translate("lAgopUS"));
  }

  @Test
  void testTranslate_te() {
    assertEquals("teve", extension.translate("te"));
  }

  @Test
  void testTranslate_teve() {
    assertEquals("teveveve", extension.translate("teve"));
  }

  @Test
  void testTranslate_lambada() {
    assertEquals("lavambavadava", extension.translate("lambada"));
  }
}
